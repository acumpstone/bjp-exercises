/*
 * Name: Alexis Cumpstone
 * Created: 2018-07-26
 * Updated: 2018-07-26
 * Filename: PrintFactors.java
 * Details: Building Java Programs, 4th ed., Chpt 5 Exercise 9
*/

import java.util.*; // For Scanner

// Prints the factors of an integer
public class PrintFactors {
	
	/*
	 * Initializes scanner and calls method
	 * input: None
	 * output: Passes scanner object to method
	*/
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		printFactors(stdin);
	}
	
	/*
	 * Prints the factors of an integer
	 * input: Scanner object
	 * output: None, prints factors to console
	*/
	public static void printFactors(Scanner console) {
		
		int input;
		
		System.out.print("Type a number: ");
		
		// Proceed only if valid integer entered
		if (!console.hasNextInt()) {
			return; // Abort method
		} else {
			input = console.nextInt();
		}
		
		// Cannot factor this
		if (input <= 0) {
			throw new IllegalArgumentException("Error: negative or 0 value");
		}
		
		//Print factors to console, fencepost
		System.out.print("1 ");
		for (int i = 2; i < input; i++) {
			if ((input % i) == 0) {
				System.out.print("and " + i + " ");
			}
		}
		
		System.out.println();
	}
	
}