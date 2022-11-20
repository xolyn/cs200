///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           TestAdventure
// Course:          CS 200
//
// Author:          Lingyu Zhou
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

/**
 * This contains testing methods for the Adventure program.
 */
public class TestAdventure {

    /**
     * Uncomment testing methods to have them run.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        testParseCoordinates();
        testParseFields();
        testDetermineLocation();
        testEnter();
        // before revise: // t0d0: add test and testing method
    }

    /**
     * Tests for the parseCoordinates method.
     */
    private static void testParseCoordinates() {
        boolean error = false;

        {   //example 1:
            String coordinateString = "8,6";
            int[] expected = new int[]{8, 6};
            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testParseCoordinates 1) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 2:
            String coordinateString = "3,b";
            //int [] expected = new int[]{8,6};
            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(null, actual)) {
                System.out.println("testParseCoordinates 2) Expected: null"
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 3:
            String coordinateString = ",";
            //int [] expected = new int[]{8,6};
            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(null, actual)) {
                System.out.println("testParseCoordinates 3) Expected: null"
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 4:
            String coordinateString = "asv";

            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(null, actual)) {
                System.out.println("testParseCoordinates 4) Expected: null"
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 5:
            String coordinateString = "   12 , 3";
            int [] expected = new int[]{12,3};
            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testParseCoordinates 5) Expected: null"
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }


        {   //example 6:
            String coordinateString = "/3";
            //int [] expected = new int[]{8,6};
            int[] actual = Adventure.parseCoordinates(coordinateString);
            if (!Arrays.equals(null, actual)) {
                System.out.println("testParseCoordinates 6) Expected: null"
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        if (error) {
            System.out.println("Error in testParseCoordinates.");
        } else {
            System.out.println("All tests in testParseCoordinates passed.");
        }
    }

    /**
     * Tests for the ParseFields method.
     */
    private static void testParseFields() {
        boolean error = false;

        {   //example 1:
            String coordinateString = "//eee/ce";
            String[] expected = new String[]{"", "", "eee", "ce"};
            String[] actual = Adventure.parseFields(coordinateString);
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testParseCoordinates 1) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 2:
            String coordinateString = "//  / /";
            String[] expected = new String[]{"", "", "", "", ""};
            String[] actual = Adventure.parseFields(coordinateString);
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testParseCoordinates 2) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 3:
            String coordinateString = "$$";
            String[] expected = new String[]{"$$"};
            String[] actual = Adventure.parseFields(coordinateString);
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testParseCoordinates 3) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }
        if (error) {
            System.out.println("Error in testParseField.");
        } else {
            System.out.println("All tests in testParseField passed.");
        }

    }

    /**
     * Tests for the DetermineLocation method.
     */
    private static void testDetermineLocation() {
        boolean error = false;
        String map[][][] = new String[8][6][];
        {   //example 1:
            int[] loc = {3, 3};
            int[] expected = {3, 4};
            int[] actual = Adventure.determineLocation(map, loc, "d");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 1) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 2:
            int[] loc1 = {0, 3};
            int[] expected = {7, 3};
            int[] actual = Adventure.determineLocation(map, loc1, "W");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 2) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 3:
            int[] loc = {2, 2};
            int[] expected = {3, 2};
            int[] actual = Adventure.determineLocation(map, loc, "s");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 3) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example4:
            int[] loc = {1, 0};
            int[] expected = {1, 5};
            int[] actual = Adventure.determineLocation(map, loc, "a");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 4) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 5:
            int[] loc = {1,5};
            int[] expected = {1,0};
            int[] actual = Adventure.determineLocation(map, loc, "d");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 5) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        {   //example 6:
            int[] loc = {7, 3};
            int[] expected = {0, 3};
            int[] actual = Adventure.determineLocation(map, loc, "s");
            if (!Arrays.equals(expected, actual)) {
                System.out.println("testDetermineLocation 6) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString(actual));
                error = true;
            }
        }

        if (error) {
            System.out.println("Error in testDetermineLocation.");
        } else {
            System.out.println("All tests in testDetermineLocation passed.");
        }
    }

    /**
     * Tests for the Enter method.
     */
    private static void testEnter() {
        boolean error = false;

        {   //example 1:
            int[] start = {2, 2};
            String[][][] arr1 = new String[8][6][];
            try {
                arr1 = Adventure.loadAdventure("wumpus.advcfg", start);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Random rand = new Random();
            boolean actual = Adventure.enter(arr1, start, rand);
            boolean expected = true;
            if (actual != expected) {
                System.out.println("testDetermineLocation 1) Expected: " + expected
                        + " Actual: " + actual);
                error = true;
            }
        }

        {   //example 2:
            int[] start = {2, 2};
            String[][][] arr1 = new String[8][6][];
            try {
                arr1 = Adventure.loadAdventure("eldorado.advcfg", start);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Random rand = new Random();
            boolean actual = Adventure.enter(arr1, start, rand);
            boolean expected = false;
            if (actual != expected) {
                System.out.println("testDetermineLocation 1) Expected: " + expected
                        + " Actual: " + actual);
                error = true;
            }
        }
        if (error) {
            System.out.println("Error in testDetermineLocation.");
        } else {
            System.out.println("All tests in testDetermineLocation passed.");
        }
    }

}

