package come_recursive_basics;
import java.util.Scanner;
public class Check_whether_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter a number: ");
		      int number = sc.nextInt();
		      
		      int a = 0, b = 1;
		      boolean isFibonacci = false;
		      
		      while(a <= number) {
		          if(a == number) {
		              isFibonacci = true;
		              break;
		          }
		          int c = a+ b;
		          a = b;
		          b = c;
		      }
		        
		        if(isFibonacci) {
		            System.out.println(number +" is a Fibonnacci number,");
		        } else {
		            System.out.println(number + " is not a fibonacci number,");
		        }
		        sc.close();
		}
		}