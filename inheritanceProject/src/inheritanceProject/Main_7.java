package inheritanceProject;

public class Main_7 {

    public static void main(String[] args) throws CloneNotSupportedException {

        cloneExmple C = new cloneExmple(105, "Maruthi", 50000);

        cloneExmple emp2 = (cloneExmple) C.clone();

        System.out.println("Original Employee");
        System.out.println(C);

        System.out.println();

        System.out.println("Cloned Employee");
        System.out.println(emp2);

        System.out.println();

        System.out.println("Same Object: " + (C == emp2));
    }
}