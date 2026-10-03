package switchcase_practice_Basics;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 5:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Maruthi");
                break;
            case 2:
                System.out.println("sony");
                break;
            case 3:
                System.out.println("sashi");
                break;
            case 4:
                System.out.println("Nani");
                break;
            case 5:
                System.out.println("ammu");
                break;
            default:
                System.out.println("Invalid name");
        }

        sc.close();
    }
}