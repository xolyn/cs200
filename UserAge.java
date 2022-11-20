///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           UserAge
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


public class UserAge {
    public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int c1 = scnr.nextInt();
            int c2 = scnr.nextInt();
            int c3 = scnr.nextInt();
            int c4 = scnr.nextInt();
            int c5 = scnr.nextInt();
            int c6 = scnr.nextInt();

            double d1=c2/365+c1/12+c3;
            double d2=c5/365+c4/12+c6;
            int currAge=(int)(Math.abs(d1-d2));
            if(c4<c1){currAge-=1;}
            else if(c4==c1 && c5<c2){currAge-=1;}
            System.out.println(currAge);
            }
        }


