package mypackage;

public class Main_12 {

    public static void main(String[] args) {

        Product p;

        // Electronics
        p = new Electronics();
        p.displayProduct();
        p.calculatePrice();

        System.out.println();

        // Clothing
        p = new Clothing();
        p.displayProduct();
        p.calculatePrice();

        System.out.println();

        // Grocery
        p = new Grocery();
        p.displayProduct();
        p.calculatePrice();
    }
}