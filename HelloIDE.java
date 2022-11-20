///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           HelloIDE
// Course:          COMP SCI 200
//
// Author:          Js
// Email:           lzhou256
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

public class HelloIDE {


        public static void main(String[] args) {

            System.out.println("What is your name?");

            Scanner scnr = new Scanner(System.in);
            String name =scnr.nextLine();
            boolean w=true;
            w=scnr.hasNextLine();
            name=name.trim();
            name=name.replaceAll("\n","");
            name=name.replaceAll("\t","");
            name=name.replaceAll("\r","");


            if(w==true)
            {
                if (name.equals(""))
                    {System.out.println("Hello, "+Config.DEFAULT_NAME+"!");}
                    else{System.out.println("Hello, "+name+"!");}
            }
            else
            {System.out.println("Hello, "+Config.DEFAULT_NAME+"!");}
        }
    }
