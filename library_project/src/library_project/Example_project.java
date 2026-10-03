package library_project;
import java.util.ArrayList;
import java.util.Scanner;

public class Example_project {
	    
	    static class Book {
	        int id;
	        String title;
	        String author;
	        boolean issued;
	        Book(int id, String title, String author) {
	            this.id = id;
	            this.title  = title;
	            this.author = author;
	            this.issued = false;
	        }
	        
	        void didsplay() {
	            System.out.println("ID: " + id);
	            System.out.println("title: " + title);
	            System.out.println("author: " + author);
	System.out.println("status: " + (issued ? " Issued" : " available"));
	            
	        System.out.println("------------------------");
	        }
	    }
	    
	    static ArrayList<Book> books = new ArrayList<>();
	    
	    public static void addBook(Scanner sc) {
	        System.out.print("Enter Book ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.print("Enter Book Title: ");
	        String title = sc.nextLine();
	        
	        System.out.print("Enter author Name: ");
	        String author = sc.nextLine();
	        
	        books.add(new Book(id,title, author));
	        System.out.println("Book added Successfully!");
	    }
	    
	    public static void viewBooks() {
	        if(books.isEmpty()) {
	            System.out.println("No books available.");
	            return;
	        }
	        for(Book b : books) {
	            b.didsplay();
	        }
	    }
	    
	    public static void seachBook(int id) {
	        for(Book b : books) {
	            if(b.id == id) {
	                b.didsplay();
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	    }
	    
	    public static void issuedBook(int id) {
	        for(Book b : books) {
	            if(b.id == id) {
	                if(!b.issued) {
	                    b.issued = true;
	             System.out.println("book issued Successfully!");
	                } else {
	                    System.out.println("Bok Alreday Issued!");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	    }
	    
	    public static void returnbook(int id) {
	        for(Book b : books) {
	            if(b.id == id) {
	                if(b.issued) {
	                    b.issued = false;
	System.out.println("Book returned Successfully!");
	} else {
	    System.out.println("Book was not issued");
	}
	return;
	}
	}
	System.out.println("Book Not found!");
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    while(true) {
	        
	        System.out.println("\n==== LIBRAYRY MANAGEMENT SYSTEM =====");
	        System.out.println("1.add Book");
	        System.out.println("2. view books");
	        System.out.println("3. Search Book");
	        System.out.println("4.issue Book");
	        System.out.println("5. Return Book");
	        System.out.println("6. Exit");
	        
	        System.out.println("Enter choice: ");
	       int chocie = sc.nextInt();
	       
	       switch(chocie) {
	           
	           case 1:
	               addBook(sc);
	               break;
	               
	               case 2:
	                   viewBooks();
	                   break;
	                   
	                   case 3:
	                       System.out.println("Enter Book Id: ");
	                       seachBook(sc.nextInt());
	                       break;
	                       
	                       case 4:
	                           System.out.println("Enter Book ID: ");
	                           issuedBook(sc.nextInt());
	                           break;
	                           
	                           case 5:
	                               System.out.println("Enter Book Id: ");
	                               returnbook(sc.nextInt());
	                               break;
	                               
	                               case 6:
	                                   System.out.println("Thank you!");
	                                   System.exit(0);
	                                   
	                                   default:
	                                System.out.println("Invalid choice");
	       }
	    }
	}
	}
