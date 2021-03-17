/*
 * Author: Alexis Cumpstone
 * Created: 2019-04-04
 * Updated: Never
 * Filename: Mississippi.java
 * Details: Building Java Programs 4th Ed., 1:P1
*/

import java.io.*;

public class Mississippi {
    public static void main(String[] args) {
        drawM();
        for (int count = 0; count < 2; count++) {
          drawI();
          drawS();
          drawS();
        }
        drawI();
        drawP();
        drawP();
        drawI();
    }
    
    public static void drawM() {
        System.out.println("M     M");
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        for (int times = 3; times > 0; times--) {
            System.out.println("M     M");
        }
    }
    
    public static void drawI() {
    	  System.out.println();
        System.out.println(" IIIII");
        for (int times = 5; times > 0; times--) {
            System.out.println("   I");        
        }
        System.out.println(" IIIII");
    }
    
    public static void drawS() {
        System.out.println();
        System.out.println(" SSSSS ");
        System.out.println("S     S");
        System.out.println("S");
        System.out.println(" SSSSS ");
        System.out.println("      S");
        System.out.println("S     S");
        System.out.println(" SSSSS");
    }
    
    public static void drawP() {
        System.out.println();
        System.out.println("PPPPPP");
        System.out.println("P     P");
        System.out.println("P     P");
        System.out.println("PPPPPP");
        for (int times = 3; times > 0; times--) {
            System.out.println("P");
        }
    }
}