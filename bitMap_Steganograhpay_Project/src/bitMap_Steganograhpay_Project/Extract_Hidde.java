package bitMap_Steganograhpay_Project;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class Extract_Hidde {
	    
	    public static void  main(String[] args) throws Exception {
	   BufferedImage image = ImageIO.read(new File("output.png"));
	        
	        String message = extractMessage(image);
	        
	        System.out.println("Hidden message: " + message);
	    }
	    
	    public static String extractMessage(BufferedImage image) {
	        int width = image.getTileWidth();
	        
	        // Read message Length
	        int messageLength = 0;
	        for(int i = 0; i < 32; i++) {
	            int x = i % width;
	            int y = i / width;
	            
	            int pixel = image.getRGB(x,y);
	            int bit = pixel & 1;
	            
	            messageLength = (messageLength << 1) | bit;
	        }
	        
	        byte[] messageBytes = new byte[messageLength];
	        int bitIndex = 0;
	        
	        for(int i = 0 ; i < messageLength; i++) {
	            byte b =0; 
	            
	            for(int j = 0; i < 8; j++) {
	                int x = (bitIndex + 32) % width;
	                int y = (bitIndex + 32) / width;
	                
	                int pixel = image.getRGB(x,y);
	                int bit = pixel & 1;
	                
	                b = (byte) ((b << 1) | bit);
	                
	                bitIndex++;
	            }
	            
	            messageBytes[i] = b;
	        }
	        
	        return new String(messageBytes);
	    }
	}
	            