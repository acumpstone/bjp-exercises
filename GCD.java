/*
 * Name: Alexis Cumpstone
 * Created: 2018-07-15
 * Updated: 2018-07-15
 * Filename: GCD.java
 * Details: Building Java Programs, 4th ed, Chpt 5 Exercise 2
*/

import java.util.*;

//Calculates greatest common denominator of two integers
public class GCD {
	
	/*
	 * Calls other methods to get two integers and calculate their gcd
	 * input: User input
	 * outpu: Passes user input and the 2 integers as parameters to other methdods
	*/
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		int firstNum = getInt(console);
		int secondNum = getInt(console);
		
		int gcdAnswer = gcd(firstNum, secondNum);
		
		System.out.println("GCD(" + firstNum + "," + secondNum + ") = " + gcdAnswer);
	}
	
	/*
	 * Ensures user enters a valid integer
	 * input: Scanner object
	 * output: The valid integer the user inputs
	*/
	public static int getInt(Scanner input) {
		
		System.out.print("Type a number: ");
		while (!input.hasNextInt()) {
			input.next();
			System.out.println("Error: number must be an integer.");
			System.out.print("Type a number: ");
		}
		return input.nextInt();
	}
	
	/*
	 * Returns GCD of 2 integers
	 * input: 2 integers
	 * output: GCD
	*/
	public static int gcd(int num1, int num2) {
		
		//Euclid: If one of the numbers is 0, GCD is absolute value of other number
		if (num1 == 0) {
			return Math.abs(num2);
		} else if (num2 == 0) {
			return Math.abs(num1);
		}
		
		//Need these for Euclid's algorithm
		int highNum = Math.max(num1, num2);
		int lowNum = Math.min(num1, num2);
		
		//Recursion! It really works! It's like magic!
		return gcd(lowNum, (highNum % lowNum));
	}
	
}

 
 