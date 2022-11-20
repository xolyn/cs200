///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           FourPerLine
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

public class FourPerLine {
    public static void main(String[] args) {
        int[] list=new int[12];
        Scanner scnr = new Scanner(System.in);
        for(int i=0;i<12;i++){
            list[i]= scnr.nextInt();
        }

        for(int i=0;i<12;i+=4){
            System.out.println(list[i]+" "+list[i+1]+" "+list[i+2]+" "+list[i+3]);
        }
    }
}
