/*
 * Author: Alexis Cumpstone
 * Created: 2019-04-11
 * Updated: 2019-04-12
 * Filename: TreeBark.java
 * Details: Building Java Programs 4th Ed., 2:P2
*/

/*
 * Pseudo-code
 Print containing line;
 for (each repeating set of lines) {
 for (each inside top line) {
     print pipe;
     print some or no spaces;
     print a carat;
     print some or no spaces;
     print a carat;
     print some or no spaces;
     print pipe;
 }
 }
 print containing line;
 for (each repeating set of line) {
 for (each inside bottom line) {
     print pipe;
     print some or no spaces;
     print v;
     print some or no spaces;
     print v;
     print some or no spaces;
     print pipe; 
 }
 }
 print containing line;
 
  Top of figure pattern:
  spaceSet1	spaceSet2	spaceSet3
  2			0			   2
  1			2				1
  0			4				0
  2			0				2
  1			2				1
  0			4				0
  
 */
 

public class TreeBark {
    public static void main(String[] args) {
        final int WIDTH = 6;
        final int HEIGHT = 6;        
        
        printEdge(WIDTH);
        
        // Top portion of figure
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print("|");
            // % Expression oscillates between 2, 1, and 0 (for spaces)
            for (int j = ((HEIGHT - i)% 3); j > 0; j--) {
                System.out.print(" ");                
            }
            System.out.print("^");
            // Middle spaces
            for (int k = 2 * ((i - 1) % 3); k > 0; k--) {
                System.out.print(" ");            
            }
            System.out.print("^");      
            // Right spaces
            for (int l = ((HEIGHT - i) % 3); l > 0; l--) {
                System.out.print(" ");            
            }  
            System.out.print("|");
            System.out.println();
        }
        
        printEdge(WIDTH);
        
        // Bottom portion of figure
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print("|");
            // Left spaces
            for (int j = (i - 1) % 3; j > 0; j--) {
                System.out.print(" ");            
            }            
            System.out.print("v");
            // Middle spaces (notice oscillating % expression)
            for (int k = 2 * ((HEIGHT - i) % 3); k > 0; k--) {
                System.out.print(" ");
            }
            System.out.print("v");
            // Right spaces 
            for (int l = (i - 1) % 3; l > 0; l--) {
                System.out.print(" ");            
            }
            System.out.print("|");
            System.out.println();
        } 
        
       printEdge(WIDTH);          
    }
    
    public static void printEdge(int width) {
        System.out.print("+");
        
        for (int i = 1; i <= width; i++) {
            System.out.print("-");        
        }
        
        System.out.println("+");      
    }
}