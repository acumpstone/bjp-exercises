/*
 * Name: Alexis Cumpstone
 * Created: 2018-07-17
 * Updated: 2018-07-17
 * Filename: RandomX.java
 * Details: Building Java Programs, 4th ed., Chapter 5 Exercise 4
*/

import java.util.*; // For Random

// Prints lines containing random number of x's until at least 16 x's printed in one line
public class RandomX {
	
	/* 
	 * Calls method
	 * input: None
	 * output: None
	*/
	public static void main(String[] args) {
		
		randomX();
	}
	
	/*
	 * Prints random number of x's per line until at least 16 x's printed
	 * input: None
	 * output: Lines of x's
	*/
	public static void randomX() {
		
		Random rand = new Random();
		
		// Number of x's is between 5 and 20
		int numX = rand.nextInt(16) + 5;
		
		// Fencepost
		for (int i = 0; i < numX; i++) {
				System.out.print("x");
			}
		
		System.out.println();
		
		while (numX < 16) {
			numX = rand.nextInt(16) + 5;
			
			for (int i = 0; i < numX; i++) {
				System.out.print("x");
			}
			
			System.out.println();
		}
	}
}