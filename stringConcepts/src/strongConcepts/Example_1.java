package strongConcepts;

public class Example_1 {

    public static void main(String[] args) {

        // String literals (stored in String Constant Pool)
        String name1 = "Maruthi";
        String name2 = "Maruthi";
        String name3 = "Sashi";
        String name4 = "Sony";
        String name5 = "Manjula";

        // Strings created using new keyword (stored in Heap Memory)
        String name6 = new String("Maruthi");
        String name7 = new String("Maruthi");
        String name8 = new String("Manjula");
        String name9 = new String("Vannuer Swamy");

        System.out.println("===== Using == (Reference Comparison) =====");
        System.out.println("name1 == name2 : " + (name1 == name2));
        System.out.println("name6 == name7 : " + (name6 == name7));
        System.out.println("name5 == name8 : " + (name5 == name8));
        System.out.println("name1 == name6 : " + (name1 == name6));

        System.out.println();

        System.out.println("===== Using equals() (Content Comparison) =====");
        System.out.println("name1.equals(name2) : " + name1.equals(name2));
        System.out.println("name6.equals(name7) : " + name6.equals(name7));
        System.out.println("name5.equals(name8) : " + name5.equals(name8));
        System.out.println("name1.equals(name6) : " + name1.equals(name6));
        System.out.println("name3.equals(name4) : " + name3.equals(name4));
        System.out.println("name6.equals(name9) : " + name6.equals(name9));
        System.out.println("name7.equals(name6) : " + name7.equals(name6));
    }
}