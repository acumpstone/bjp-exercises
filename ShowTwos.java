/*
 * Name: Alexis Cumpstone
 * Created: July 15, 2018
 * Updated: July 15, 2018
 * Filename: ShowTwos.java
 * Details: Building Java Programs, 4th ed., Chpt. 5 Exercise 1
*/

//Shows the factors of 2 that an integer has
public class ShowTwos {
	
	/*
	 * Contains calls for showTwos method
	 * input: Integers
	 * output: Passes integer parameters to showTwos method
	*/
	public static void main(String[] args) {
		
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
	}
	
	/*
	 * Prints out each factor of 2 and the factor left over
	 * input: Integer parameters from main
	 * output: Factors of 2 and remaining factor
	*/
	public static void showTwos(int num) {
		
		System.out.print(num + " = ");
		
		while (num % 2 == 0) {
			System.out.print("2 * ");
			num /= 2;
		}
		
		//Print the remaining factor
		System.out.println(num);
	}
	
}