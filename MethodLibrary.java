///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MonsterCollector
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
import java.util.Arrays;
import java.util.Scanner;
public class MethodLibrary {
    public static void main(String args[]) {
        System.out.println("MethodLibrary");

        System.out.println("Example use of methods");
        int[] smallNums1 = {2, 1, 7, 4, 3};
        display("display:", smallNums1);

        char [] characters = {'a','b','c','d','e','f'};
        moveToHead( characters, 2);
        System.out.print("after moving: ");
        System.out.println(characters);

        int[] bigNums = {1234, 20001, 3764, 20947, 9099};
        System.out.println("after searching: " + findMax(bigNums));

        int[] smallNums2 = { 8, 7, 3, 4, 5, 0, 1};
        sortElements(smallNums2, true);
        System.out.println("after sorting: " + Arrays.toString(smallNums2));

        Scanner scnr = new Scanner("-5 0 error 25 happy 20 14 end");
        int numValid = checkValidaty( scnr, "Enter a number between 1 and 20, inclusive", 1, 20);
    }

    /**
     * This method prints the description followed by the contents of list.
     * The list begins with '[', ends with ']' and each element is separated
     * with ', '.
     * Example: display( "a description", new int[]{1,2,3})
     * a description [1, 2, 3]
     * @param description The text printed out before the list of integers.
     * @param list The array of integers to be printed.
     */
    public static void display(String description, int[] list)
    {
        System.out.print(description);
        System.out.print(" [");
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list[i]);
        }
        System.out.println("]");
    }

    /**This method revises the given array by putting the last few digits of the
     * user-given number in the given array to the beginning of the given array.
     * Example:moveToHead({'1','2','3','4','7'},2)
     * Result:{'4','7','1','2','3'}
     * @param arrayNeedChange The array that needed to move part of itself to the beginning.
     * @param digitNum The numbers of digits that user want to move that part to the beginning.
     */
    public static void moveToHead(char[] arrayNeedChange, int digitNum)
    {
        for (int i = 0 ; i < digitNum; i++)
        {
            char s = arrayNeedChange[arrayNeedChange.length - 1];
            for (int j = arrayNeedChange.length - 1; j > 0; j--)
            {
                arrayNeedChange[j] = arrayNeedChange[j - 1];
            }
            arrayNeedChange[0] = s;
        }
    }


    /**
     * This method helps user find the maxium in the given array.
     * Example: ({111,333,222})
     * Result: 333
     * @param arrayForSearch The array that needed for searching maximum inside.
     * @return max The maximum found in the given array.
     */
    public static int findMax(int[] arrayForSearch)
    {
        int max;
        max = arrayForSearch[0];
        for (int i = 0; i < arrayForSearch.length; i++)
        {
            if ( arrayForSearch[i] > max)
            {
                max = arrayForSearch[i];
            }
        }
        return max;
    }

    /**
     * This method asks user input a array with integer and changes it by sorting its elements in the given
     * order (if user's value of inIncreasing is true, then sorts increasingly, else decreasingly.)
     * Example: sortElements({3,5,1,11,0,8},false)
     * Result: [11,8,5,3,1,0]
     * @param targetArray The array that need to sort
     * @param isIncreasing Whether system sorts the elements in array increasingly or decreasingly
     *                     (true for increasingly)
     */
    public static void sortElements(int[] targetArray, boolean isIncreasing) {
        int maxTemp;
        for (int i = 0; i < targetArray.length; i++)
        {
            for (int j = i + 1; j < targetArray.length; j++)
            {
                if (isIncreasing)
                    {
                    if (targetArray[i] > targetArray[j])
                        {
                        maxTemp = targetArray[i];
                        targetArray[i] = targetArray[j];
                        targetArray[j] = maxTemp;
                        }
                    }
                else
                    {
                        if (targetArray[i] < targetArray[j])
                            {
                            maxTemp = targetArray[i];
                            targetArray[i] = targetArray[j];
                            targetArray[j] = maxTemp;
                            }
                    }
            }
        }
    }




    /**
     * This method asks user to input a introductory text and a text with numbers, a lower and an upper bound.
     * Then the method prints the introductory text, read the next integer and check whether it is in the bound
     * created by the lower and upper bound or not. If not, continue to read and check until a number in given
     * bound appears. If system read an integer in the given bound, it stops the loop of read and check and returns
     * that valid number.
     *
     * @param input The text that needed to check the numbers in it are in bound or not.
     * @param description The descriptive text that guides user to input.
     * @param lowerBound The smallest number in the checking bound.
     * @param upperBound The biggest number in the checking bound.
     * @return askedNum The fisrt number that in the bound.
     * Example("21 f 99 5 NNH","I am intro",1,10)
     * Result:I am intro
     *        Value must between 1 and 10.
     *        Value must between 1 and 10.
     */
    public static int checkValidaty(Scanner input, String description, int lowerBound, int upperBound)
    {
        System.out.println(description);
        boolean isInBound = false;
        int askedNum = 0;
        do
            {
                if (input.hasNextInt())
                {
                    askedNum = input.nextInt();
                    if (askedNum >= lowerBound && askedNum <= upperBound)
                    {
                        isInBound = true;
            }
                    else {System.out.println("Value must be between " + lowerBound + " and " + upperBound + ".");
            }
        }
                else
                    {
                        input.next();
                    }
            }
        while (!isInBound);
        return askedNum;
    }
}
