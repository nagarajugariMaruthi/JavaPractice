package java8InterviewQuetion;

@FunctionalInterface
interface Mylove {

    void show();
}

public class Functional_Interface_2 {

    public static void main(String[] args) {

        Mylove obj = () -> System.out.println("I Love you Dhanvitha");

        obj.show();
    }
}