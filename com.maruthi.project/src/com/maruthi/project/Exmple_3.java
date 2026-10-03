package com.maruthi.project;

import java.util.Scanner;

public class Exmple_3 {

    static class Book {
        int id;
        String title;
        String author;
        boolean available;

        Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.available = true;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        int count = 0;

        while (true) {

            System.out.println("\n==== Library Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, title, author);
                    count++;

                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook List:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                    "ID: " + books[i].id +
                                    ", Title: " + books[i].title +
                                    ", Author: " + books[i].author +
                                    ", Available: " + books[i].available);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Book Found!");
                            System.out.println(
                                    "ID: " + books[i].id +
                                    ", Author: " + books[i].author +
                                    ", Available: " + books[i].available);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].id == issueId) {
                            found = true;

                            if (books[i].available) {
                                books[i].available = false;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].id == returnId) {
                            found = true;

                            if (!books[i].available) {
                                books[i].available = true;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book is already available.");
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Library Management System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}