package commerceOrderManagementSystem;

import java.util.Scanner;

import com.library.model.Book;
import com.library.model.Member;
import com.library.service.LibraryService;



public class LibraryApplication {



	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        LibraryService library = new LibraryService();

	        while (true) {

	            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Display All Books");
	            System.out.println("5. Add Member");
	            System.out.println("6. Issue Book");
	            System.out.println("7. Return Book");
	            System.out.println("8. Show Issued Books");
	            System.out.println("9. Search Member");
	            System.out.println("10. Sort Books");
	            System.out.println("11. Recently Viewed Books");
	            System.out.println("12. Waiting Queue");
	            System.out.println("13. Exit");

	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter Book ID: ");
	                    int bookId = scanner.nextInt();

	                    scanner.nextLine();

	                    System.out.print("Enter Book Title: ");
	                    String title = scanner.nextLine();

	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();

	                    Book book =
	                            new Book(bookId, title, author);

	                    library.addBook(book);

	                    break;


	                case 2:

	                    System.out.print("Enter Book ID: ");

	                    int removeBookId =
	                            scanner.nextInt();

	                    library.removeBook(removeBookId);

	                    break;


	                case 3:

	                    scanner.nextLine();

	                    System.out.print("Enter Book Title: ");

	                    String searchTitle =
	                            scanner.nextLine();

	                    library.searchBook(searchTitle);

	                    break;


	                case 4:

	                    library.displayAllBooks();

	                    break;


	                case 5:

	                    System.out.print("Enter Member ID: ");

	                    int memberId =
	                            scanner.nextInt();

	                    scanner.nextLine();

	                    System.out.print("Enter Member Name: ");

	                    String name =
	                            scanner.nextLine();

	                    Member member =
	                            new Member(memberId, name);

	                    library.addMember(member);

	                    break;


	                case 6:

	                    System.out.print("Enter Book ID: ");

	                    int issueBookId =
	                            scanner.nextInt();

	                    System.out.print("Enter Member ID: ");

	                    int issueMemberId =
	                            scanner.nextInt();

	                    library.issueBook(
	                            issueBookId,
	                            issueMemberId
	                    );

	                    break;


	                case 7:

	                    System.out.print("Enter Book ID: ");

	                    int returnBookId =
	                            scanner.nextInt();

	                    library.returnBook(returnBookId);

	                    break;


	                case 8:

	                    library.showIssuedBooks();

	                    break;


	                case 9:

	                    System.out.print("Enter Member ID: ");

	                    int searchMemberId =
	                            scanner.nextInt();

	                    library.searchMember(searchMemberId);

	                    break;


	                case 10:

	                    library.sortBooks();

	                    break;


	                case 11:

	                    library.showRecentlyViewedBooks();

	                    break;


	                case 12:

	                    library.showWaitingQueue();

	                    break;


	                case 13:

	                    System.out.println(
	                            "Thank you for using Library Management System."
	                    );

	                    scanner.close();

	                    System.exit(0);

	                    break;


	                default:

	                    System.out.println(
	                            "Invalid choice. Please try again."
	                    );
	            }
	        }
	    }
	}