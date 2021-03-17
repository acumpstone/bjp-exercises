/*
 * Author: Alexis Cumpstone
 * Created: 2019-04-11
 * Updated: Never
 * Filename: StarsAndSlashes.java
 * Details: Building Java Programs 4th Ed., 2:P1
*/

/* Pseudo-code:
   for (each line){
       print a number of asterisks or none
       print one or more spaces
       print a number of forward slashes and maybe some back slashes
       print one or more spaces (same number as above)
       print a number or asterisks or none (same number as above)
   }
   
   asterisks	spaces	forward slashes	back slashes	spaces	asterisks
   6				1			12						0					1			6
   5				2			10						2					2			5
   4				3			8						4					3			4
   3				4			6						6					4			3
   2				5			4						8					5			2
   1				6			2						10					6			1
   0				7			0						12					7			0
*/



public class StarsAndSlashes {
    public static void main(String[] args) {
    	  final int LINES = 50;
    	  
    	  // each line of the figure
        for (int i = 1; i <= LINES; i++) {
        	
        	   // asterisks
            for (int j = (LINES - i); j > 0; j--) {
                System.out.print("*");
            }
            // spaces
            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }
            // forward slashes
            for (int l = (2 * LINES - 2 * i); l > 0; l--) {
                System.out.print("/");
            }
            // back slashes
            for (int m = (2 * i -2); m > 0; m--) {
                System.out.print("\\");
            }
            // spaces (again)
            for (int k2 = i; k2 > 0; k2--) {
                System.out.print(" ");
            }
            // asterisks (again)
            for (int j = (LINES - i); j > 0; j--) {
                System.out.print("*");
            }
            
            System.out.println();     
        }        
    }

}