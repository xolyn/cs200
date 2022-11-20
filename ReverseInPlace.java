///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           ReverseInPlace
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

public class ReverseInPlace {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int length= scnr.nextInt();
        int[] list=new int[length];
        for(int i=length-1;i>=0;i--) {
            list[i]=scnr.nextInt();
        }
        for(int i=0;i<length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("\n");
    }
}
