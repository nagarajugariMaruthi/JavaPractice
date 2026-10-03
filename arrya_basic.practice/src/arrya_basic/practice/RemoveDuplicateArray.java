package arrya_basic.practice;
public class RemoveDuplicateArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 1, 4, 2, 3};

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < array.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}