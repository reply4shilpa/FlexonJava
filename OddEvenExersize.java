package com.flexon.basic;

import java.util.Scanner;

public class OddEvenExersize {

	public static void main(String args[]) {
		int num1;
		int num2;
		System.out.println("Enter an range of Integer number:");

		// The input provided by user is stored in num1 and num2

		do {
			Scanner input = new Scanner(System.in);
			num1 = input.nextInt();
			Scanner input2 = new Scanner(System.in);
			num2 = input2.nextInt();
		} while (num1 > num2);

		/*
		 * If number is divisible by 2 then it's an even number else odd number
		 */
		int total = 0;

		for (int i = num1; i <= num2; i++) {
			total = total + i;

			if (i % 2 == 0)
				System.out.println("Entered number is even: " + i);
			else
				System.out.println("Entered number is odd" + i);
		}
		System.out.println("my total is " + total);
	}

}
