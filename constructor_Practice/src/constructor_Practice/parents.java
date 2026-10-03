package constructor_Practice;

public class parents {

    parents() {
        System.out.println("Parent Constructor");
    }
}

class Child extends parents {

    Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        Child obj = new Child();

    }
}