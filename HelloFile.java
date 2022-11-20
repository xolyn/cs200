///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           HelloFile
// Course:          COMP SCI 200
//
// Author:          Ly
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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

// TODO: Create a PrintWriter
// TODO: Get user input using Scanner
// TODO: Write valid user input to the PrintWriter, catch any exceptions

public class HelloFile {
    public static void main(String[] args) throws Exception {
        try{
        System.out.println("Enter the file name:");
        Scanner scnr = new Scanner(System.in);
        boolean hbl=true;
        String txt="";
            String in=scnr.nextLine();
            System.out.println("Enter something to write in "+in+":");
        String in1=scnr.nextLine();
            boolean hasNL=true;
            do{
                System.out.println("Enter something to write in "+in+":");
                txt=scnr.nextLine();
                if(txt.trim()!=""){hbl=false;}
            }while(hbl);
            //






        FileOutputStream fileStream = null;
        PrintWriter outFS = null;
        fileStream = new FileOutputStream(in);
        outFS = new PrintWriter(fileStream);
        outFS.println(txt);
        outFS.close();} catch(Exception e){
            System.out.println("Exception occurred: PrintWriter failed");}

    }
}