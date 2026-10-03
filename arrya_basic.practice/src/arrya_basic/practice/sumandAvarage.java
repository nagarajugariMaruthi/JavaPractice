package arrya_basic.practice;

public class sumandAvarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {10,20,30,50};
   
   int sum = 0;
  double  avarage;
  // caluculate avarage 
   for(int i = 0; i < arr.length; i++) {
	   sum = sum + arr[i];
   }
   // caluculate sum
   avarage = (double) sum / arr.length;
   
   System.out.println("sum =" + sum);
   System.out.println("avarage =" + avarage);
	}
}
   
   
