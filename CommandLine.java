///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           CommandLine
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
public class CommandLine {
    public static void main(String[] args) {
        if(args.length==1){
            int a=Integer.parseInt(args[0]);
            System.out.print(a*a);}
        else if(args.length==2){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.print(a*b);
        }
        else{System.out.print("usage: java CommandLine.java [squareSide] or java CommandLine.java [rectangleSide1]" +
                " [rectangleSide2]");}
    }
}
