///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TextConverter
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

public class TextConverter {
    /**
     * Provides the main menu for the text converter and calls methods based on menu options chosen.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Welcome to the Text Converter.\n" +
                "Available Actions:\n" + "  1337) convert to 1337-speak\n" + "  rev) reverse the string\n" +
                "  caesar) rotate each character right 1 position if it is a letter\n" + "  quit) exit the program\n" +
                "\n" + "Please enter a string: ");

        //testAction1337();
        //testActionCaesar();
        //testActionReverse();

        Scanner scnr = new Scanner(System.in);
        String input=scnr.nextLine();
        //System.out.println(actionCaesar("abcdz"));

        boolean stay=true;
        while(stay){
            System.out.print("Action (1337, rev, caesar, quit): ");
        Scanner scnr1 = new Scanner(System.in);
        String func=scnr1.nextLine();

        if(func.equals("1337")){System.out.println(action1337(input));}
        else if (func.equals("rev")){System.out.println(actionReverse(input));}
        else if(func.equals("caesar")) {System.out.println(actionCaesar(input));}
        else if(func.equals("quit")){stay=false; }
        else{System.out.println("Unrecognized action.");
            }
        }
        System.out.println("See you next time!");
    } //start,menu,end,calling


    /**
     * 1337 - convert the string to leet-speak:
     * Replace each L or l with a 1 (numeral one)
     * Replace each E or e with a 3 (numeral three)
     * Replace each T or t with a 7 (numeral seven)
     * Replace each O or o with a 0 (numeral zero)
     * Replace each S or s with a $ (dollar sign)
     *
     * @param current Original string
     * @return string converted to leet-speak.
     */
    public static String action1337(String current) {
        current=current.replace("L","1");
        current=current.replace("l","1");
        current=current.replace("E","3");
        current=current.replace("e","3");
        current=current.replace("T","7");
        current=current.replace("t","7");
        current=current.replace("O","0");
        current=current.replace("o","0");
        current=current.replace("S","$");
        current=current.replace("s","$");
        return current;
    }

    /**
     *  tests action1337 method with various cases to ensure it is working
     *  correctly.
     */
    public static void testAction1337() {
        boolean error = false;

        String input1 = "LEeTs";
        String expected1 = "1337$";
        String result1 = action1337( input1);
        if ( !result1.equals( expected1)) {
            error = true;
            System.out.println("1) testAction1337 with input " + input1 + ", expected: " + expected1 + " but result: " + result1);
        }
        //FIX ME
        //add at least 2 other test cases (Use different variable names). What edge cases can you think of?
        String input2 = "34ep";
        String expected2 = "343p";
        String result2 = action1337( input2);
        if ( !result2.equals( expected2)) {
            error = true;
            System.out.println("2) testAction1337 with input " + input2 + ", expected: " + expected2 + " but result: " + result2);
        }

        String input3 = "sb";
        String expected3 = "$b";
        String result3 = action1337( input3);
        if ( !result3.equals( expected3)) {
            error = true;
            System.out.println("3) testAction1337 with input " + input3 + ", expected: " + expected3 + " but result: " + result3);
        }

        if ( error) {
            System.out.println( "testAction1337 failed");
        } else {
            System.out.println("testAction1337 passed");
        }
    }


    /**
     * This reverses the order of characters in the current string.
     *
     * @param snr Original string to be reversed.
     * @return The string in reversed order.
     */
    public static String actionReverse(String snr) {
        //int l=snr.length();
        String cnt = "";

        for(int j=snr.length()-1;j>=0;j--) {
            String add = "" + snr.charAt(j);
            cnt = cnt.concat(add);
        }
        return cnt;
    }

    /**
     *  tests actionReverse method with various cases to ensure it is working
     *  correctly.
     */
    public static void testActionReverse() {
        boolean error = false;

        String input1 = "Abc";
        String expected1 = "cbA";
        String result1 = actionReverse( input1);
        if ( !result1.equals( expected1)) {
            error = true;
            System.out.println("1) testActionReverse with input " + input1 + ", expected: " + expected1 + " but result: " + result1);
        }
        //FIX ME
        //add at least 2 other test cases (Use different variable names). What edge cases can you think of?

        String input2 = "aaA";
        String expected2 = "Aaa";
        String result2 = actionReverse( input2);
        if ( !result2.equals( expected2)) {
            error = true;
            System.out.println("2) testActionReverse with input " + input2 + ", expected: " + expected2 + " but result: " + result2);
        }

        String input3 = "asd2c";
        String expected3 = "c2dsa";
        String result3 = actionReverse( input3);
        if ( !result3.equals( expected3)) {
            error = true;
            System.out.println("3) testActionReverse with input " + input3 + ", expected: " + expected3 + " but result: " + result3);
        }


        if ( error) {
            System.out.println( "testActionReverse failed");
        } else {
            System.out.println("testActionReverse passed");
        }
    }

    /**
     * This rotates each character right 1 position if it is a letter,
     *  'z' and 'Z' will be converted to 'a' and 'A' respectively
     *
     * @param snc Original string
     * @return The rotated string
     */
    public static String actionCaesar(String snc) {
        int l=snc.length();
        String res="";
        //String cnc;
        for(int k=0;k<l;k++){
            if(snc.charAt(k)=='z'){
                res=res+"a";
            }
            else if(snc.charAt(k)=='Z'){
                res=res+"A";
            }
            else{
                char thatChar=snc.charAt(k);
                int thatCharASCII=(int)thatChar;
                if((thatCharASCII>=65&&thatCharASCII<=90)||(thatCharASCII>=97&&thatCharASCII<=122))
                {res=res+((char)(thatChar+1));}
                else{res=res+thatChar;}
            }
        }
        return res;
    }

    /**
     *  tests actionReverse method with various cases to ensure it is working
     *  correctly.
     */
    public static void testActionCaesar() {
        boolean error = false;

        String input1 = "gotIt";
        String expected1 = "hpuJu";
        String result1 = actionCaesar( input1);
        if ( !result1.equals( expected1)) {
            error = true;
            System.out.println("1) testActionCaesar with input " + input1 + ", expected: " + expected1 + " but result: " + result1);
        }
        //FIX ME
        //add at least 2 other test cases (Use different variable names). What edge cases can you think of?

        String input2 = "ch200";
        String expected2 = "di200";
        String result2 = actionCaesar( input2);
        if ( !result2.equals( expected2)) {
            error = true;
            System.out.println("2) testActionCaesar with input " + input2 + ", expected: " + expected2 + " but result: " + result2);
        }

        String input3 = "Sd212";
        String expected3 = "Te212";
        String result3 = actionCaesar( input3);
        if ( !result3.equals( expected3)) {
            error = true;
            System.out.println("3) testActionCaesar with input " + input3 + ", expected: " + expected3 + " but result: " + result3);
        }

        if ( error) {
            System.out.println( "testActionCaesar failed");
        } else {
            System.out.println("testActionCaesar passed");
        }
    }

}
