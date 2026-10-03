package aggregation;

public class House {
    String HouseName;
    Room room;  // House HAS-A Room
    
    House(String HouseName) {
        this.HouseName = HouseName;
        this.room = new Room(101, "Bedroom");  // Create Room inside House
    }
    
    void displayHouse() {
        System.out.println("house name " + HouseName);
        room.displayRoom();  // Call Room's displayRoom() method
    }
}