///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           FileHandler
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Derived from Laura "Hobbes" Legault, CS 301 Sp 16
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandler {
    //TODO
    //1. Prompt user for filename
    //2. Call openFile method with that filename
    //3. if file does not open catch the exception and prompt
    //      user for another file name

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isFileOpened=false;
            String name="";
            do{
                try{
                /*do{
                System.out.println("What is the name of the file you want to open?");
                name=scnr.next();
                openFile(name);}while(name!="test.txt");

                 */
                    System.out.println("What is the name of the file you want to open?");
                    name = scnr.next();

                    if(name=="test.txt")isFileOpened=true;
                    openFile(name);

                }catch(Exception IOException){

                System.out.println("That file name is invalid");}}while(!isFileOpened);


    }
    
    /**
     * This method takes in a name and will open a file with that name
     * and print the first line in that file. Then return true.
     * If file is not found it will throw IOException.
     *
     * @param fileName String argument of name of file to be opened for reading
     * @return true if file is opened
     * @throws IOException if the file isn't found
     */
     //DO NOT CHANGE THIS METHOD, just call it.
    private static boolean openFile(String fileName)throws IOException{
        FileInputStream fileByteStream = new FileInputStream(fileName);
        Scanner inFS = new Scanner(fileByteStream);
        String line1 = inFS.nextLine();
        System.out.println(line1);
        fileByteStream.close();
        return true;
    }
}
