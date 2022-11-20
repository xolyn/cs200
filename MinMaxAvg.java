///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MinMaxAvg
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

public class MinMaxAvg {
    public static void main(String[] args) {
        int[] list=new int[10];
        Scanner scnr = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
        list[i]=scnr.nextInt();
        }//assign values
        double avgVal,sumVal=0.0;
        int minVal=list[0];
        int maxVal=list[0];

        for(i=0;i<9;i++){
            if(list[i+1]>list[i]){maxVal=list[i+1];}
            if(list[i+1]<list[i]){minVal=list[i+1];}
            sumVal+=list[i];
        }
        sumVal+=list[9];
        avgVal=sumVal/10;

        System.out.println(minVal+" "+maxVal+" "+avgVal);

    }
}
