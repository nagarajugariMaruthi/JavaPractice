package mypackage;

public class Product {

    void calculatePrice() {
        System.out.println("Calculate Price");
    }

    void displayProduct() {
        System.out.println("Product Details");
    }
}

class Electronics extends Product {

    @Override
    void calculatePrice() {

        double price = 49999;
        double gst = price * 18 / 100;
        double finalPrice = price + gst;

        System.out.println("Product: Electronics");
        System.out.println("Electronics GST: 18%");
        System.out.println("Final Price: " + finalPrice);
    }
}

class Clothing extends Product {

    @Override
    void calculatePrice() {

        double price = 50000;
        double gst = price * 12 / 100;
        double finalPrice = price + gst;

        System.out.println("Product: Clothing");
        System.out.println("Clothing GST: 12%");
        System.out.println("Final Price: " + finalPrice);
    }
}

class Grocery extends Product {

    @Override
    void calculatePrice() {

        double price = 600000;
        double gst = price * 5 / 100;
        double finalPrice = price + gst;

        System.out.println("Product: Grocery");
        System.out.println("Grocery GST: 5%");
        System.out.println("Final Price: " + finalPrice);
    }
}