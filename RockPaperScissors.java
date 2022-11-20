///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:        RockPaperScissors
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
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random(Config.SEED);
        int ran = rand.nextInt(3) + 1;
        System.out.print("Please select one of [R/P/S]: ");
        //System.out.println(ran);
        Scanner scnr = new Scanner(System.in);
        String res = scnr.next();
        res=res.toUpperCase();
        if (res.equals("R")) {
            System.out.println("You chose: Rock");
        } else if (res.equals("P")) {
            System.out.println("You chose: Paper");
        } else if (res.equals("S")) {
            System.out.println("You chose: Scissors");
        } else {
            System.out.println("Invalid choice! Defaulting to Rock.");
            res = "R";
        }

        /*AI:rock*/
        if (ran == 1) {
            System.out.println("I chose: Rock");
            if (res.equals("R")) {
                System.out.println("A Tie!");
            }
            if (res.equals("P")) {
                System.out.println("Paper beats rock - you win!");
            }
            if (res.equals("S")) {
                System.out.println("Rock beats scissors - you lose!");
            }
        }

        /*AI:paper*/
        else if (ran == 2) {
            System.out.println("I chose: Paper");
            if (res.equals("R")) {
                System.out.println("Paper beats rock - you lose!");
            }
            if (res.equals("P")) {
                System.out.println("A Tie!");
            }
            if (res.equals("S")) {
                System.out.println("Scissors beats paper - you win!");
            }
        }

        /*AI:scissors*/
        else /*if (ran == 2) */{
            System.out.println("I chose: Scissors");
            if (res.equals("R")) {
                System.out.println("Rock beats scissors - you win!");
            }
            if (res.equals("P")) {
                System.out.println("Scissors beats paper - you lose!");
            }
            if (res.equals("S")) {
                System.out.println("A Tie!");
            }

        }


    }
}




