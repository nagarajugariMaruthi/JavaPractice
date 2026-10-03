package java.practce.cls;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Student_Management_project {

		public static void main(String[] args) {
	        
	        ArrayList<student> students = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);
	        
	        while(true) {
	            System.out.println("\n--- Student Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2.view Students");
	            System.out.println("3.Serch Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5.Exit");
	            System.out.print("Enter choice: ");
	            
	            int choice = sc.nextInt();
	            
	            switch(choice) {
	                
	                case 1:
	                    System.out.println("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    
	                    System.out.println("Enter Name: ");
	                    int name = sc.nextInt();
	                    
	                    System.out.println("Enter age: ");
	                    int age = sc.nextInt();
	                    
	                    students.add(new student());
	                    System.out.println("Student added successfully!");
	                    break;
	                    
	                    case 2:
	                        for(student s : students) {
	                            s.display();
	                        }
	                        break;
	                        
	                        case 3:
	                            System.out.println("Enter student ID: ");
	                            int searchId = sc.nextInt();
	                            
	                            boolean found = false;
	                            for(student s : students) {
	                            if(student.id == searchId) {
	                                    s.display();
	                                    found = true;
	                                }
	                            }
	                            
	                            if(!found) {
	                                System.out.println("Student not found");
	                            }
	                            break;
	                            
	                            case 4:
	                                System.out.print("Enter Student ID to Delete: ");
	                                int deleteId = sc.nextInt();
	            boolean removeIf = students.removeIf(as -> student.id == deleteId); 
	                          System.out.println("Student Deleted Successfully!");
	                                break;
	                                case 5:
	                                    System.out.println("Thank you!");
	                                    System.exit(0);
	                                    
	                                    default:
	                                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}