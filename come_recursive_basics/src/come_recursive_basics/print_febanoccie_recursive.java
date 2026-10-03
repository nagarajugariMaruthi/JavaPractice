package come_recursive_basics;
import java.util.Scanner;
public class print_febanoccie_recursive {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		    static int a = 0, b = 1, c;
		    
		    static void printFibonacci(int n ) {
		        if(n > 0) {
		            c = a + b;
		            a = b;
		            b = c;
		            
		            System.out.print(a + " ");
		            
		            printFibonacci(n - 1);
		        }
		    }
		    
		    public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);
		        
		     System.out.print("Fibonacci series: ");
		     
		     // print the first two terms
		     System.out.print(a + " " + b + " ");
		     
		     // printf the remaining tersm recursively
		     printFibonacci(a - 2);
		     
		     sc.close();
		    }
		}
