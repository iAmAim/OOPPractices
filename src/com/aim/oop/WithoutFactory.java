package com.aim.oop;

import java.util.Scanner;

public class WithoutFactory {
	
	public static void main(String args[])
	{
		System.out.println("Enter course code");
		Scanner scan = new Scanner(System.in);	
		String code = scan.nextLine();
		
	
		switch(code)
		{
		case "J":
			System.out.println("Java selected\n");
		break;
		
		case "C":
		System.out.println("C sharp selected\n");
		break;
		default:
			System.out.println("There is no such course code. Please try again");
		}
	}
	
}
