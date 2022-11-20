///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           IntException
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////

import java.util.Scanner;
import java.util.InputMismatchException;

public class IntException {
   public static void main(String[] args) {
      System.out.print(isOdd());
   }
   
   /**
   This method returns true is user's input is odd number, vice versa.
    */
   public static boolean isOdd() {
      boolean oddornot=false;
      int k;
      try {
         Scanner input = new Scanner(System.in);
         k=input.nextInt();
         if(Math.abs(k)%2==1){oddornot=true;}
         //
      }
      catch(Exception e){

      }
      return oddornot;
   }

}