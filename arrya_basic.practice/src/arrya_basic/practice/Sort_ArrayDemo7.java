package arrya_basic.practice;

public class Sort_ArrayDemo7 {

    public static void main(String[] args) {

        // Array Declaration
        int[] arr = {50, 20, 40, 10, 30};

        System.out.println("Original Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting Array in Ascending Order
        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}