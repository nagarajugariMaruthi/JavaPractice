package inheritance;

interface Animal {

    void eat();
}

interface Pet {

    void play();
}

class Dog implements Animal, Pet {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class DogMain {

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.eat();
        obj.play();
    }
}