package aggregation;

public class Room {
    int roomNumber;      // Room should have roomNumber
    String roomType;     // Room should have roomType
    
    Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
    
    void displayRoom() {  // Method name should be displayRoom()
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
    }
}