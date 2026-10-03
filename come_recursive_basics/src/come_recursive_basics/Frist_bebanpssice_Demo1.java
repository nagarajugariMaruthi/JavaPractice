package come_recursive_basics;
import java.util.Scanner;
public class Frist_bebanpssice_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter n value ");
  int n = sc.nextInt();
  
   int a = 0,b = 1;
  
   System.out.println("First" + n + " febonascisse numebr n value:");

   for(int i = 0; i <=n; i++) {
  	 System.out.println(a + " ");
     int c = a + b;
     a = b;
     b = c;
   }
   sc.close();
	}
}