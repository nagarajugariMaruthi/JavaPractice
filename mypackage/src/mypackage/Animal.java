package mypackage;

public class Animal {

	void sound() {
		System.out.println("Animal Make Sound : ");
	}
}

 class  Dog extends Animal {
	 
	 @Override
	 void sound() {
		 System.out.println("Dog Say : Bow Bow ");
	 }
 }
 
  class Cat extends Animal {
	  
	  @Override
	  void sound() {
		  System.out.println("Cat Say :  meow meow ");
	  }
	  }
  
  class Cow extends Animal {
	  
	  @Override
	  void sound() {
		  
		  System.out.println("Cow Say : Moo Moo");
	  }
  }
  
	  
  