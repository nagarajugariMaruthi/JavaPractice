package methods_Question;

import java.util.function.Consumer;

class printer {
    void print(String name) {
        System.out.println(name);
    }
}

public class Example_3 {

    public static void main(String[] args) {

        printer printer = new printer();

        Consumer<String> c1 = x -> printer.print(x);

        Consumer<String> c2 = printer::print;

        c2.accept("Maruthi");
    }
}