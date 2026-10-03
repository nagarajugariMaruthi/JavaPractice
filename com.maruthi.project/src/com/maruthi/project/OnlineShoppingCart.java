package com.maruthi.project;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " - " + name + " - Rs." + price);
    }
}

class ShoppingCart {
    ArrayList<Product> cart = new ArrayList<>();

    void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.name + " added to cart.");
    }

    void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is Empty.");
            return;
        }

        double total = 0;

        System.out.println("\n----- Shopping Cart -----");
        for (Product p : cart) {
            System.out.println(p.name + " - Rs." + p.price);
            total += p.price;
        }

        System.out.println("-------------------------");
        System.out.println("Total Amount: Rs." + total);
    }

    void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is Empty.");
            return;
        }

        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Total Bill: Rs." + total);

        cart.clear();
    }
}

public class OnlineShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mobile", 20000);
        Product p3 = new Product(3, "Headphones", 2000);
        Product p4 = new Product(4, "Keyboard", 1500);
        Product p5 = new Product(5, "Mouse", 800);

        ShoppingCart cart = new ShoppingCart();

        while (true) {

            System.out.println("\n===== ONLINE SHOPPING CART =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Products:");
                    p1.display();
                    p2.display();
                    p3.display();
                    p4.display();
                    p5.display();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    switch (id) {
                        case 1:
                            cart.addProduct(p1);
                            break;
                        case 2:
                            cart.addProduct(p2);
                            break;
                        case 3:
                            cart.addProduct(p3);
                            break;
                        case 4:
                            cart.addProduct(p4);
                            break;
                        case 5:
                            cart.addProduct(p5);
                            break;
                        default:
                            System.out.println("Invalid Product ID.");
                    }
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    System.out.println("Thank You for Shopping!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}