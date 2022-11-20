///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TestInputMethods
// Course:          COMP SCI 200
//
// Author:          Ly.
// Email:           lzhou256@wisc.edu
// Lecturer's Name: name of your lecturer
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

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This contains testing methods for the InputMethods class.
 * @author Jim Williams
 * @author Ly.
 */
public class TestInputMethods {

    /**
     * This main method runs the selected tests.  Comment out a test if you don't want it to run.
     *
     * @param args unused
     */
    public static void main(String[]args) {
        testGetValidInt();
        testRemoveDuplicates();
    }

    /**
     * Tests that the getValidInt method handles all the cases described in its method header comment.
     */
    private static void testGetValidInt() {
        boolean error = false;

        {  //test 1, a straightforward "happy path" case "9\n" with min 5 and max 10, should result in 9
            int expected = 9;
            Scanner input = new Scanner("9\n");
            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 1) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        {  //test 2, null scanner.
            int expected=-1;
            Scanner input = null;
            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 2) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        {  //test 3, min > max
            int expected=-2;
            Scanner input = new Scanner("9\n");
            int actual = InputMethods.getValidInt(input, "Enter a number between 15 and 7:", 15, 7);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 3) Error, expected: " + expected + ", actual: " + actual);}
        }

        {  //test 4, min value check, "5\n" with min 5 and max 10.
            int expected=5;
            Scanner input = new Scanner("5\n");
            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 4) Error, expected: " + expected + ", actual: " + actual);}
        }

        {  //test 5, max value check, "6\n" with min 0 and max 6 should result in 6.
            int expected=6;
            Scanner input = new Scanner("6\n");
            int actual = InputMethods.getValidInt(input, "Enter a number between 0 and 6:", 0, 6);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 5) Error, expected: " + expected + ", actual: " + actual);}
        }

        {  //test 6, skip multiple lines
            int expected=1;
            Scanner input = new Scanner("0\n0\n1\n3");
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 6:", 1, 6);
            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 6) Error, expected: " + expected + ", actual: " + actual);}
        }

        if (error) {
            System.out.println("testGetValidInt failed");
        } else {
            System.out.println("testGetValidInt passed");
        }
    }

    /**
     * Tests that the removeDuplicates method handles all the cases described in its method header comment.
     */
    private static void testRemoveDuplicates() {
        boolean error = false;

        {  //test 1, a simple case
            ArrayList<Integer> list = new ArrayList<>();
            list.add(20);
            //can also add an array of items to an array list with:
            //list.addAll(java.util.Arrays.asList( new Integer[]{20}));

            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(20);
            ArrayList<Integer> actual = InputMethods.removeDuplicates(list);
            if (!actual.equals(expected))
            {
                error = true;
                System.out.println("testRemoveDuplicates 1) Error, expected: " + expected + " , actual: " + actual);
            }
        }

        {  //test 2, null list
            ArrayList<Integer> list = null;
            ArrayList<Integer> expected = new ArrayList<>();
            ArrayList<Integer> actual = InputMethods.removeDuplicates(list);
            if (!actual.equals(expected))
            {
                error = true;
                System.out.println("testRemoveDuplicates 2) Error, expected: "+expected + " , actual: " + actual);
            }
        }

        {  //test 3, null values in arraylist
            ArrayList<Integer> list = new ArrayList<>();
            list.add(20);
            list.add(null);
            list.add(30);
            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(20);
            expected.add(30);
            ArrayList<Integer> actual = InputMethods.removeDuplicates(list);
            if (!actual.equals(expected))
            {
                error = true;
                System.out.println("testRemoveDuplicates 3) Error, expected: " + expected + " , actual: " + actual);
            }
        }

        {  //test 4, duplicate values and values out of order
            ArrayList<Integer> list = new ArrayList<>();
            list.add(20);
            list.add(30);
            list.add(30);
            list.add(70);
            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(20);
            expected.add(30);
            expected.add(70);
            ArrayList<Integer> actual = InputMethods.removeDuplicates(list);
            if (!actual.equals(expected))
            {
                error = true;
                System.out.println("testRemoveDuplicates 4) Error, expected: " + expected + " , actual: " + actual);
            }
        }

        {  //test 5, verify input list is unchanged
            ArrayList<Integer> list = new ArrayList<>();
            list.add(20);
            list.add(90);
            list.add(120);
            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(20);
            expected.add(90);
            expected.add(120);
            ArrayList<Integer> actual = InputMethods.removeDuplicates(list);
            if (!actual.equals(expected))
            {
                error = true;
                System.out.println("testRemoveDuplicates 5) Error, expected: " + expected + " , actual: " + actual);
            }
        }

        if (error) {
            System.out.println("testRemoveDuplicates failed");
        } else {
            System.out.println("testRemoveDuplicates passed");
        }
    }
}
