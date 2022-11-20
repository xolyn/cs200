///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           ArrayListFun
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
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFun {
   
   /**
	 * Counts the number of instances of a particular value in list.
	 * Returns null if list is null.
	 * 
	 * @param list
	 * @param checkNum
	 * @return the number of Integer occurrences in list equal to checkNum
	 */
	public static Integer countOccurrences(ArrayList<Integer> list, int checkNum) {
		if(list==null){return null;}
		else{int t=0;
			for(int i=0;i< list.size();i++)
		{if(list.get(i)==checkNum){t++;}}
			return t;}
	}
	
	/**
	 * Calculates the sum, product, or mean of all values in list.
	 * Returns null if list is null.
	 * 
	 * @param list
	 * @param operation
	 * @return the sum, product, or mean of all values in list
	 */
	public static Integer mathOperation(ArrayList<Integer> list, String operation) {
		if(list==null){return null;}

		else{
			int sum=0;
			int mult=1;
			int mean=0;
			if(operation.toLowerCase().equals("add")){
				for(int i=0;i< list.size();i++){sum+=list.get(i);}
				return sum;
			}
			else if(operation.toLowerCase().equals("multiply")){

				for(int i=0;i< list.size();i++){mult*=list.get(i);}
				return mult;
			}
			else if(operation.toLowerCase().equals("mean")){
				for(int i=0;i< list.size();i++){sum+=list.get(i);}
				mean=sum/ list.size();
				return mean;
			}
			else {return 0;}
		}
	}
	
	/**
	 * Converts the 1s and 0s in list (binary value) to its decimal value
	 * 
	 * Example: 100110 from binary to decimal
	 * 
	 * 1 * 2^5 +
	 * 0 * 2^4 +
	 * 0 * 2^3 +
	 * 1 * 2^2 +
	 * 1 * 2^1 +
	 * 0 * 2^0 =
	 * 38
	 * 
	 * For more information on binary, see zyBooks chapter 3.1
	 * 
	 * Returns null if list is null.
	 * 
	 * @param list
	 * @return the decimal value of the binary representation of list
	 */
	public static Integer binaryToDecimal(ArrayList<Integer> list) {
		int tobin=0;
		if(list==null){return null;}
		else{
			for(int i=0;i< list.size();i++){
				if(list.get(i)==1){tobin+=Math.pow(2.0, list.size()-1-i);
				}
				else{}
			}
			return tobin;
		}
	}
	
	/**
	 * Returns true if list is a (character) palindrome.
	 * Returns null if list is null.
	 * 
	 * @param list
	 * @return true if the list is a palindrome, else false. 
	 */
	public static Boolean isPalindrome(ArrayList<Character> list) {
		if(list==null){return null;}
		else{
			int l=list.size();
			int repTime=l/2;
			boolean isPalin=true;
			for(int i =0; i<repTime; i++){
				//System.out.println(in.charAt(i));
				//System.out.println(in.charAt(l-1-i));
				if(list.get(i)!=list.get(l-1-i)){
					isPalin=false;
					break;
				}
			}
			return isPalin;
		}
	}
	
	public static void main(String[] args) {
		int []list = {2, 0, 5, 2, 2, 1, 1};
		int checkNum = 2;
		//

	}
}