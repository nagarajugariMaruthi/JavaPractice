package strongConcepts;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String constrant pool 
	 String name1 = "maruthi";
	 String name2 = "maruthi";
	 String name3 = "Dhanvith";
	 
	 String name5 = new String("maruthi");
	 String name6 = new String("maruthi");
	 String name7 = new String("dhanvith");
	 String name8 = new String("Sony");
	
	 
	 System.out.println(" constarnt Pool memory =  ");
	 
	 System.out.println(name1 == name2);
	 System.out.println(name2 == name2);
	 System.out.println(name1 == name5);
	 System.out.println(name3 == name7);
	 
	 System.out.println("Heap memory ");
	 
	 System.out.println(name1.equals(name8));
	 System.out.println(name2.equals(name2));
	 System.out.println(name5.equals(name6));
	 System.out.println(name7.equals(name8));
	 System.out.println(name3.equals(name7));
	}
}
	
	
	 
	 
