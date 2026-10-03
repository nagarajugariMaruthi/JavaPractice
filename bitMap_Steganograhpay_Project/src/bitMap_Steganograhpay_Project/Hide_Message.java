package bitMap_Steganograhpay_Project;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Hide_Message {

    public static void main(String[] args) throws Exception {

        String message = "Secret Message";

        File inputImage = new File("input.png");
        File outputImage = new File("output.png");

        BufferedImage image = ImageIO.read(inputImage);

        hiddenMessage(image, message);

        ImageIO.write(image, "png", outputImage);

        System.out.println("Message hidden successfully!");
    }

    public static void hiddenMessage(BufferedImage image, String message) {

        byte[] messageBytes = message.getBytes();
        int messageLength = messageBytes.length;

        int width = image.getWidth();
        int bitIndex = 0;

        // Store message length (32 bits)
        for (int i = 0; i < 32; i++) {

            int x = i % width;
            int y = i / width;

            int pixel = image.getRGB(x, y);

            int bit = (messageLength >> (31 - i)) & 1;

            pixel = (pixel & 0xFFFFFFFE) | bit;

            image.setRGB(x, y, pixel);
        }

        // Store message bits
        for (byte b : messageBytes) {

            for (int i = 7; i >= 0; i--) {

                int x = (bitIndex + 32) % width;
                int y = (bitIndex + 32) / width;

                int pixel = image.getRGB(x, y);

                int bit = (b >> i) & 1;

                pixel = (pixel & 0xFFFFFFFE) | bit;

                image.setRGB(x, y, pixel);

                bitIndex++;
            }
        }
    }
}