package mypackage;

abstract class Bank {

   abstract void getintreste();
}

 class SBI extends Bank  {
	 
	 @Override
	 
	 void getintreste() {
		 System.out.println("SbI intrest Rate  : 7% ");
	 }
 }
 
  class HDFC extends Bank {
	  
	  @Override
	  
	  void getintreste() {
		  System.out.println("HdFC Bank intrest Rate : 7.8%");
	  }
  }
  
  class ICIC extends Bank {
	  
	  @Override
	  
	  void getintreste() {
		  
		  System.out.println("ICIC Bank intrest Rate  : 8%");
	  }
  }
  