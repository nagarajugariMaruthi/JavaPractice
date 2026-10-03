package opps_Methods;

public class Book {

//	`bookId`
//	* `bookName`
//	* `authorName`
//	* `price`
	
	int EmpbookId;
	String EmpbookName;
	String EmputhorName;
	double EmpPrice;
	
	void takeinput(int l_EmpbookId, String l_EmpbookName, double l_EmpPrice) {
		
		 EmpbookId = l_EmpbookId;
		 EmpbookName = l_EmpbookName;
		 EmputhorName = l_EmpbookName;
		 EmpPrice = l_EmpPrice;
		 
	}
	
	void printdate() {
		
		System.out.println("Emp id : " + EmpbookId);
		System.out.println("EmpBookName : " + EmpbookName);
		System.out.println("EmputhorName : " + EmputhorName);
		System.out.println("Price : " + EmpPrice);
	}
	
	public static void main(String[] args) {
		
		Book Emp1 = new Book();
		Emp1.takeinput(105 , "java programming Book", 499);
		Emp1.printdate();
		
		Book Emp2 = new Book();
		Emp2.takeinput(106, "python Programming Book" , 399);
		Emp2.printdate();
	}
	}
		 
		 
	

