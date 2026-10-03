package java8InterviewQuetion;

interface Vehicle {

    static void start() {
        System.out.println("Static method is starting");
    }
}

public class Static_Method_1 {

    public static void main(String[] args) {

        Vehicle.start();
    }
}