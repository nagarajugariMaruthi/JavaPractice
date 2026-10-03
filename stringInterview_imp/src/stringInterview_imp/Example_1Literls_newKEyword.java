package stringInterview_imp;

public class Example_1Literls_newKEyword {

    public static void main(String[] args) {
  /// How do you create a string in Java? (Literal vs new keyword)
  /// 
        String s1 = "maruthi";
        String s2 = "maruthi";
        String s3 = "dhanvith";
        String s4 = "dhanvith";

        String s5 = new String("Sunil");
        String s6 = new String("Sunil");
        String s7 = new String("Meghana");
        String s8 = new String("dhanvith");

        // Literal Strings
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.concat(s8));
        System.out.println(s3.compareTo(s8));

        // new Keyword Strings
        System.out.println(s5 == s6);
        System.out.println(s7 == s5);
        System.out.println(s5.compareTo(s8));

        // Literal vs new Keyword
        System.out.println(s1 == s5);
        System.out.println(s4 == s8);
        System.out.println(s5.equals(s8));
        System.out.println(s5.equals(s6));
        System.out.println(s3 == s8);
    }
}