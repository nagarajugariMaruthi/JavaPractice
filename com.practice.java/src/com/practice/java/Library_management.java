package com.practice.java;

import java.util.ArrayList;

// Abstract class
abstract class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    abstract void displayRole();
}

// Student class
class Student extends Person {
    Student(String name) {    
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }
}

// Librarian class
class Librarian extends Person {
    Librarian(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Librarian");
    }
}

// Book class
class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public void displayBook() {
        System.out.println("ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Status: " + (issued ? "Issued" : "Available"));
    }
}

// Library class
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void issueBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book unavailable.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid book ID.");
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                book.displayBook();
            }
        }
    }
}

// Main class
public class Library_management {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "C Programming", "Dennis Ritchie"));
        library.addBook(new Book(103, "Python Programming", "Guido van Rossum"));

        library.displayAvailableBooks();

        library.searchBook("Java Programming");

        library.issueBook(101);

        library.displayAvailableBooks();

        library.returnBook(101);

        library.displayAvailableBooks();
    }
}