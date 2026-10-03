package constructor_Practice;

public class Book_Class {

    String title;
    String author;
    double price;

    // Parameterized Constructor
    Book_Class(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy Constructor
    Book_Class(Book_Class obj) {

        this.title = obj.title;
        this.author = obj.author;
        this.price = obj.price;
    }

    // Display Method
    void display() {

        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Original Object
        Book_Class book1 = new Book_Class("Java Programming Book", "James Gosling", 4999);

        // Copy Object
        Book_Class book2 = new Book_Class(book1);

        System.out.println("Original Book:");
        book1.display();

        System.out.println("Copied Book:");
        book2.display();

        // Change copied object
        book2.price = 499;

        System.out.println("After changing the copied book:");

        System.out.println("Original Book:");
        book1.display();

        System.out.println("Copied Book:");
        book2.display();
    }
}