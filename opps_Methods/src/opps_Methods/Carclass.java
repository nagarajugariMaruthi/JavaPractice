package opps_Methods;

public class Carclass {

    String brand;
    double model;
    double price;

    // No-Argument Constructor
    Carclass() {

        brand = "Mercedes-Benz";
        model = 2000;
        price = 5000000;
    }

    // Method to print data
    void printData() {

        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car Price : " + price);
    }

    public static void main(String[] args) {

        Carclass car1 = new Carclass();

        car1.printData();
    }
}