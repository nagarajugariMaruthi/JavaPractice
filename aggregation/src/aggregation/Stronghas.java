package aggregation;

public class Stronghas {

  int RoomNumber;
  String RoomType;
  
    Stronghas(int RoomNumber, String Roomtype) {
    	
    	this.RoomNumber = RoomNumber;
    	this.RoomType = RoomType;
    }
   
    void displayStronghas() {
    	
    	System.out.println("RoomNUmber : " + RoomNumber);
    	System.out.println("RoomType : " + RoomType);
    }
}