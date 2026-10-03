package arrya_basic.practice;

public class Frequency_Elements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 1, 4, 2, 3};

        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            frequency[i] = 1;

            if (array[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    frequency[i]++;
                    array[j] = -1;
                }
            }
        }

        System.out.println("Element\tFrequency");

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                System.out.println(array[i] + "\t\t" + frequency[i]);
            }
        }
    }
}