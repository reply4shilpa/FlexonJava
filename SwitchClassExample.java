package com.flexon.basic;

import java.util.Scanner;

public class SwitchClassExample {

	public static void main(String args[]) {
		//Scanner scan;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter character new character");

	    
	    char ch = myObj.next().charAt(0); 
		
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println("Value is: " + ch);
			break;
		case 'b':
		case 'B':
			System.out.println("Value is: " + ch);
			break;
		case 'c':
		case 'C':
			System.out.println(" Value is: " + ch);
			break;
		default:
			System.out.println("Default: Value is: " + ch);
			break;
		}
	}
}
