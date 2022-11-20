///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Rectangles
// Course:          COMP SCI 200
//
// Author:          Js
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int c1 = scnr.nextInt();
        int c2 = scnr.nextInt();
        int c3 = scnr.nextInt();
        int c4 = scnr.nextInt();
        int c5 = scnr.nextInt();
        int c6 = scnr.nextInt();
        int c7 = scnr.nextInt();
        int c8 = scnr.nextInt();
        double r1Area = Math.abs(c1 - c3) * Math.abs(c2 - c4);
        double r2Area = Math.abs(c5 - c7) * Math.abs(c6 - c8);
        if (r2Area > r1Area) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
