package come_recursive_basics;
import java.util.Scanner;
public class sumofn_febnoccie {

		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter n value: ");
		    int n = sc.nextInt();
		    
		    int a = 0 , b = 1; 
		    int sum = 0;
		    
		    for(int i = 1; i <= n; i++) {
		        sum = sum + a;
		        
		        int c = a + b;
		        c = b;
		        b = c;
		    }
		    
		    System.out.println("sum of the first "+ n + " fibonacci numbers + " + sum);
		    
		    sc.close();
		}
		}
