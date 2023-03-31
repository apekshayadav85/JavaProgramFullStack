package Basics;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer to string
		int num = 42;
		String stringNum = Integer.toString(num);
		System.out.println("num is an integer: " + num);
		System.out.println("stringNum is a string: " + stringNum);

		// String to integer
		String strNum = "42";
		int num1 = Integer.parseInt(strNum);
		System.out.println("strNum is a string: " + strNum);
		System.out.println("num is an integer: " + num1);

		// Integer to double
		int num2 = 42;
		double doubleNum = (double) num2;
		System.out.println("num is an integer: " + num2);
		System.out.println("doubleNum is a double: " + doubleNum);

	}

}
