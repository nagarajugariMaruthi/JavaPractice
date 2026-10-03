package lamda_EXPRESSIONS;
@FunctionalInterface
interface Converte {

    String convertString(String str);
}

public class Example_10 {

    public static void main(String[] args) {

        Converte obj = str -> str.toLowerCase();

        String result = obj.convertString("MARUTHI");

        System.out.println("Converted to lowercase: " + result);
    }
}