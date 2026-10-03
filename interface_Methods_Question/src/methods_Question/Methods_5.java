package methods_Question;

interface MyInterface {

    default void display() {
        System.out.println("this is the default methods");
    }
}

public class Methods_5 implements MyInterface {

    // Override default method
    @Override
    public void display() {
        System.out.println("this is the Override default methods");
    }

    public static void main(String[] args) {
        Methods_5 m = new Methods_5();

        m.display();
    }
}