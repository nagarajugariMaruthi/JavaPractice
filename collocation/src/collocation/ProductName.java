package collocation;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductName {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> Products = new ArrayList<>();

        Products.add("Laptops");
        Products.add("Mobile");
        Products.add("Headphone");
        Products.add("Keyboard");
        Products.add("Mouse");

        // Create IteratorExample
        Iterator<String> iterator = Products.iterator();

        // Iterate through products
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}