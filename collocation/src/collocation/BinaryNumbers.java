package collocation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {

    public static void main(String[] args) {

        int n = 5;

        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        System.out.println("First " + n + " Binary Numbers");

        for (int i = 1; i <= n; i++) {

            String current = queue.poll();

            System.out.println(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}