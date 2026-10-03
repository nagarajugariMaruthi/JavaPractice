package come_recursive_basics;

public class Final_method {

    static class Parent {
        final void display() {
            System.out.println("This is a final method");
        }
    }

    static class Child extends Parent {
        // Cannot override display()
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}