package com.practice.dowhile;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count digits → count++, num = num / 10
	Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter a number");
	int num = sc.nextInt();
	
    int count = 0;
    while (num != 0) {
        num = num / 10;   // remove last digit
        count++;          // increase count
    }
    System.out.println("number of  digits "+count);
	}

}
