///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           GroceryFile
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

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileOutputStream;


public class GroceryFile {
    public static void main(String[] args) {
        ArrayList<Integer> amounts = new ArrayList<>(
                Arrays.asList(2,4,8,30,6,10,3,2,1));
        ArrayList<String> items = new ArrayList<>(
                Arrays.asList("onions","green peppers","diet coke", "eggs",
                        "garlic", "yogurt","lemons","milk", "cheese"));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = scan.nextLine();

        //TODO: call the makeGroceryFile method and catch and print an exception that may be thrown with:
        //        //                 System.out.print("Caught FileNotFoundException: " + e.getMessage());
        try{
            makeGroceryFile(fileName,amounts,items);
        }catch(Exception FileNotFoundExeption){
            System.out.print("Caught FileNotFoundException: " + FileNotFoundExeption.getMessage());
        }


    }

    /**
     * Opens a file and writes the grocery list inside using a PrintWriter
     * @param fileName the name of the file to be created
     * @param amounts the amount of each item in the grocery list
     * @param items the name of the products in the grocery list
     * @throws FileNotFoundException if unable to open fileName to write
     */
    public static void makeGroceryFile(String fileName, ArrayList<Integer> amounts,
                                       ArrayList<String> items) throws FileNotFoundException {
        
            FileOutputStream fileStream = null;
            PrintWriter outFS = null;
            fileStream = new FileOutputStream(fileName);
            outFS = new PrintWriter(fileStream);
            for (int i = 0; i < amounts.size(); i++) {
                outFS.println(amounts.get(i) + " " + items.get(i));
            }
            //outFS.flush();
            outFS.close();


    }
}