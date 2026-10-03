package arrya_basic.practice;
public class countEvenorodd_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		int [] arr= {10,25,15,30,50};
		
		int Evecount = 0;
		int oddcount = 0;
	
	for (int i = 0; i < arr.length -1; i++) {
		
		if (arr[i] % 2 == 0) {
			Evecount++;
		} else {
			oddcount++;
		}
		System.out.println("Even number = "+ Evecount);
		System.out.println("odd Number =" + oddcount);
	}
	}
}