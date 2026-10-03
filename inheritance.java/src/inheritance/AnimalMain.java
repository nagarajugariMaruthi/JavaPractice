package inheritance;

class Animal {

    String name;
    int age;

    void display() {
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age : " + age);
    }
}

class Dog extends Animal {

    String breed;

    void displayAnimals() {
        System.out.println("Dog Breed : " + breed);
    }
}

public class AnimalMain {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.name = "Maruthi";
        d.age = 26;
        d.breed = "Labrador";

        d.display();
        d.displayAnimals();
    }
}