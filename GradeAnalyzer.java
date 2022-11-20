///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           GradeAnalyzer
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

import java.util.Random;
import java.util.ArrayList;

public class GradeAnalyzer {

	/**
	 * This method first generates a random number between 0 and 100 (both inclusive),
	 * and then append this generated number at the end of the ArrayList grades.
	 * 
	 * Note: If either of the parameters is null, just return.
	 * 
	 * @param grades the ArrayList of all students' grades
	 * @param rand a random generator to generate grades
	 */
	public static void addGrade(ArrayList<Integer> grades, Random rand) {
		if(grades==null||rand==null){return;}
		else{
		grades.add(rand.nextInt(101));}
	}
	
	/**
	 * This method searches for the highest score in the ArrayList.
	 * 
	 * @param grades the ArrayList of scores to be searched from
	 * @return the maximum element in the ArrayList; -1 if it is null;
	 *         or 0 if the ArrayList is empty.
	 */
	public static int findMaxScore(ArrayList<Integer> grades) {
		if(grades==null)return -1;


		else if(grades.isEmpty()==true)return 0;
		else{
			int max=grades.get(0);
			for(int i=1;i<grades.size();i++){
			if(grades.get(i)>max){max=grades.get(i);}
			}
			return max;
		}

	}
	
	/**
	 * This method calculates an average over all the scores in the ArrayList.
	 * 
	 * Note: The return value should include decimals.
	 * Make sure to use double division instead of integer division.
	 * 
	 * @param grades the ArrayList of all scores
	 * @return the average over all the elements in the ArrayList;
	 *         -1 if the ArrayList is null or empty;
	 */
	public static double calcAverageScore(ArrayList<Integer> grades) {
		int sum=0;
		if(grades==null||grades.isEmpty()==true)return -1;
		else{for(int i=0;i<grades.size();i++){sum+=grades.get(i);}}
		double avg=(double)sum/grades.size();
		return avg;
	}
	
	/**
	 * This method calculates the percentage of students whose grades are greater than or equal to
	 * a certain threshold. E.g.:
	 *     if grades = [1, 2, 3, 4, 5]
	 *     and threshold = 4
	 *     the return value should be 40.0 (because 4, 5 are above threshold; 2 / 5 = 40%)
	 * @param grades the ArrayList of all students' grades
	 * @param threshold  a specific number to compare with
	 * @return a percentage in the range of [0, 100]; or -1 if the ArrayList is null or empty.
	 */
	public static double calcPercentageAbove(ArrayList<Integer> grades, int threshold) {
		int c=0;
		double pctg;
		if(grades==null||grades.isEmpty()==true)return -1;
		else{for(int i=0;i<grades.size();i++){if(grades.get(i)>=threshold){c++;}}}
		pctg=(double)c/grades.size();
		pctg*=100;
		return pctg;
	}
	
	/**
	 * This method finds out all the students in the ArrayList with a certain grade,
	 * and stores their indices into a new ArrayList as return value.
	 * 
	 * @param grades the ArrayList of all students' grades
	 * @param gradeToFind a specific grade to be found in the ArrayList
	 * @return an ArrayList of found indices in ascending order; or null if grades is null  mk
	 */
	public static ArrayList<Integer> findStudentsWithGrade(ArrayList<Integer> grades, int gradeToFind) {
		if(grades==null)return null;
		else{ArrayList<Integer> re =new ArrayList<>();
		for(int i=0;i<grades.size() ;i++){
			if(grades.get(i)==gradeToFind){re.add(i);}
		}
		return re;
		}
	}
	//
	
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		Random rand = new Random(Config.SEED);
		for (int i = 0; i < Config.NUM_STUDENTS; i++)
		{addGrade(grades, rand);}
		//for (int i = 0; i < Config.NUM_STUDENTS; i++)
		//{System.out.println();}

		int maxScore = findMaxScore(grades);
		System.out.println("The highest score in this class is: " + maxScore);
		
		double aveScore = calcAverageScore(grades);
		System.out.println("The average score in this class is: " + aveScore);
		
		double passingRate = calcPercentageAbove(grades, 60);
		System.out.println("The percentage of students above 60 is: " + passingRate + "%");
		
		ArrayList<Integer> studentIndices = findStudentsWithGrade(grades, 100);
		System.out.println("Here are the IDs of students who got full marks: " + studentIndices);

	}

}
