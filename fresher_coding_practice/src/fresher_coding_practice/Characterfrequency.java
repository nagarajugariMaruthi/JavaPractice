package fresher_coding_practice;

public class Characterfrequency {

    public static void main(String[] args) {

        String str = "Programming";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean isAlreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (str.charAt(i) == str.charAt(k)) {
                    isAlreadyPrinted = true;
                    break;
                }
            }

            if (!isAlreadyPrinted) {
                System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}