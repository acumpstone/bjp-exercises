/*
 * Name: Alexis Cumpstone
 * Created: 2018-07-16
 * Updated: 2018-07-16
 * Filename: ToBinary.java
 * Details: Building Java Programs, 4th ed., Chapter 5 Exercise 3
*/


import java.util.*; // For Scanner

// Converts an integer into binary
public class ToBinary {
	
	/*
	 * Passes Scanner and integer to other methods
	 * input: Keyboard input stream
	 * output: Passes Scanner object and integer to other methods, prints binary result
	*/
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		// Get a valid integer
		int num = getInt(console);
		
		//Convert integer to binary
		String binaryString = toBinary(num);
		
		System.out.println(num + " in binary: " + binaryString);
	}
	
	/*
	 * Returns valid integer
	 * input: Scanner object, user input from keyboard
	 * output: Returns valid integer
	*/
	public static int getInt(Scanner input) {
		
		System.out.print("Type a number: ");
		while (!input.hasNextInt()) {
			input.next(); // Discard invalid input
			System.out.println("You must enter a valid integer.");
			System.out.print("Type a number: ");
		}

		return input.nextInt();	
	}
	
	/*
	 * Cnverts integer into binary
	 * input: An integer
	 * output: Binary string equivalent to integer
	*/
	public static String toBinary(int integer) {
		
		String binary;
		
		// Handles 0 == 0, and initializes binary string (fencepost)
		if (integer == 0 || integer == 1) {
			return integer;
		} else if (integer % 2 == 0) {
			binary = "0";
		} else {
			binary = "1";
		}
		
		integer /= 2;
		
		// Convert rest of integer into binary (if applicable)
		while (integer > 0) {
			if (integer % 2 == 0) {
				binary = "0" + binary;
			} else {
				binary = "1" + binary;
			}
			integer /= 2;
		}
		
		return binary;
	}

}