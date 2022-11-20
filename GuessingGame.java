///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           GuessingGame
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

/*import javax.swing.*;*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random(Config.SEED);
        int ran = rand.nextInt(5) + 1;
        System.out.println("Guess a number between 1 and 5");
        Scanner scnr = new Scanner(System.in);
        int g1 = scnr.nextInt();



        if(g1>ran){
            System.out.println("That's too high\nGuess again!");
            int g2=scnr.nextInt();
            if(g2==ran)
            System.out.println("You win!");
            else {System.out.println("You lose! It was "+ran);}}

        else if(g1<ran){
            System.out.println("That's too low\nGuess again!");
            int g2=scnr.nextInt();
            if(g2==ran)
                System.out.println("You win!");
            else {System.out.println("You lose! It was "+ran+".");}}

        else{System.out.println("You win!");}


    }
}
