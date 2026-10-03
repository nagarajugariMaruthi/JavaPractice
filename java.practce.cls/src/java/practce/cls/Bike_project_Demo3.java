package java.practce.cls;
import java.util.Scanner;
 public class Bike_project_Demo3{
	class Bike {
	    boolean started = false;
	    
	    void startBike() {
	        if(!started) {
	            started = true;
	            System.out.println("Bike Started Successfully!");
	        } else {
	            System.out.println("Bike is already running.");
	        }
	    }
	    void stopBike() {
	        if(started) {
	            started = false;
	            System.out.println("Bike Stopped.");
	        } else {
	            System.out.println("Bike is aready stopped.");
	        }
	    }
}
 }