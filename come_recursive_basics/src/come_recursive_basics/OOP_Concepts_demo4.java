package come_recursive_basics;

public class OOP_Concepts_demo4 {

    // Abstraction
    static abstract class Vehicle {
        abstract void start();

        void stop() {
            System.out.println("Vehicle Stopped");
        }
    }

    // Inheritance + Encapsulation
    static class Car extends Vehicle {

        private String brand;

        public Car(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        // Polymorphism (Method Overriding)
        @Override
        void start() {
            System.out.println(brand + " Car Started");
        }
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Toyota");

        vehicle.start();
        vehicle.stop();

        Car car = new Car("Honda");
        System.out.println("Brand: " + car.getBrand());
    }
}