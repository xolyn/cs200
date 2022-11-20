///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           DrawHalfPine
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

public class DrawHalfPine {

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int pineTrunkWidth = 0;
            int pineBranchWidth = 0;
            String symbol;

            System.out.print("Enter the symbol: ");
            symbol = scnr.next();

            System.out.print("Enter pine trunk width: ");
            pineTrunkWidth = scnr.nextInt();

            System.out.print("Enter pine branch width: ");
            pineBranchWidth = scnr.nextInt();

            while (pineBranchWidth <= pineTrunkWidth) {
                System.out.print("Enter pine branch width: ");
                pineBranchWidth = scnr.nextInt();
            }

            int times=pineBranchWidth-pineTrunkWidth+1;
            System.out.print("\n");
            for(int i=1;i<=times;i++){
                for(int j=0;j<i;j++){
                    System.out.print(symbol);
                }
                System.out.print("\n");
            }

            String add="";
            String singleRowTrunk="";

            for(int k=1;k<pineTrunkWidth;k++){
                add=add+symbol;

            }
            //System.out.println("----\n"+add+"\n------");


            for(int j=1;j<=pineTrunkWidth;j++){
                singleRowTrunk=singleRowTrunk+symbol;

            }
            //System.out.println("----\n"+singleRowTrunk+"\n------");


            for(int i=1;i<=times;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(symbol);
                }
                System.out.print(add+"\n");
            }



            int timesTrunkPrint=pineBranchWidth-pineTrunkWidth+1;
            for(int i=1;i<=timesTrunkPrint;i++){

                    System.out.print(singleRowTrunk);
                    System.out.print("\n");
                }

            }

        }