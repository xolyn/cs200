///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           DrawRightTriangle
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Jim Williams
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

public class DrawRightTriangle {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner scnr = new Scanner(System.in);
        String sb = scnr.next();
        System.out.print("Enter triangle height (1-10): ");
        int ht = scnr.nextInt();
        boolean xValidht=false;
        if(ht<1||ht>10){
            xValidht=true;
        }
        while(xValidht){
            System.out.println("Please enter height between 1 and 10.");
            ht = scnr.nextInt();
            if(ht>=1&&ht<=10){xValidht=false;}}
        System.out.print("\n");
        for(int i=1;i<=ht;i++){
            for(int j=0;j<i;j++){
                System.out.print(sb+" ");
            }
            System.out.print("\n");
        }

    }
}
