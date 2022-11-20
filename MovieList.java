///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MovieList
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
import java.util.Arrays;

public class MovieList {


	/**
	 * This method will take the name of a movie and delete it 
	 * in the movies if exists and
	 * delete its corresponding year in years
	 * 
	 * @param name movie name to delete
	 * @param movies List of all movies' name
	 * @param years List of corresponding years
	 */
	public static void deleteMovieByName(String name, ArrayList<String> movies, 
			ArrayList<Integer> years) {
		
	}
	/**
	 * This method will delete all movies with specific year
	 * in the movie list and  year list
	 * 
	 * @param year the given year
	 * @param movies List of all movies' name
	 * @param years List of corresponding years
	 */
	public static void deleteMoviesByYear(int year, ArrayList<String> movies, 
			ArrayList<Integer> years) {
	
	}
	/**
	 * This method will return a string that contains each
	 * movie name and its year.
	 * Each line will format as follow:
	 * <movie name> (<year>)\n
	 * 
	 * @param movies List of all movies' name
	 * @param years List of corresponding years
	 * @return string contains all movie names and years
	 */
	public static String makeMovieList(ArrayList<String> movies, 
			ArrayList<Integer> years) {
		
	}
	
	/**
	 * test for deleteMovieByName()
	 * @param movies
	 * @param years
	 */
	public static void testDeleteByName(ArrayList<String> movies, 
			ArrayList<Integer> years) {
		boolean error = false;
		deleteMovieByName("Fight Club", movies, years);
		ArrayList<String> expectedMovie1 = new ArrayList<>(
				Arrays.asList("The Shawshank Redemption","The Godfather",
						"The Godfather: Part II", "The Dark Knight",
						"12 Angry Men", "Schindler's List",
						"The Lord of the Rings: The Return of the King",
						"Pulp Fiction", "The Good, the Bad and the Ugly"
						));
		ArrayList<Integer> expectedYears1 = new ArrayList<>(
				Arrays.asList(1994, 1972, 1974, 2008, 1957, 
						1993, 2003, 1994, 1966));
		if(!movies.equals(expectedMovie1) || !years.equals(expectedYears1)){
		   error = true;
		   System.out.println("Expected movie list: " + expectedMovie1);
		   System.out.println("Actual movie list: " + movies);
		   System.out.println("Expected movie list: " + expectedYears1);
		   System.out.println("Actual movie list: " + years);
		}
		//add more test cases
		
		if(error){
		   System.out.println("testDeleteByName fail");
		}else{
		   System.out.println("testDeleteByName pass");
		   
		}
		   

	}
	
	/**
	 * test for deleteMoviesByYear()
	 * @param movies
	 * @param years
	 */
	public static void testDeleteByYear(ArrayList<String> movies, 
			ArrayList<Integer> years) {
		
	}
	
	/**
	 * test for makeMovieList()
	 * @param movies
	 * @param years
	 */
	public static void testMakeMovieList(ArrayList<String> movies, 
			ArrayList<Integer> years) {
		
	}
		
	public static void main(String[] args) {
		ArrayList<String> movies = new ArrayList<>(
				Arrays.asList("The Shawshank Redemption","The Godfather",
						"The Godfather: Part II", "The Dark Knight",
						"12 Angry Men", "Schindler's List",
						"The Lord of the Rings: The Return of the King",
						"Pulp Fiction", "The Good, the Bad and the Ugly",
						"Fight Club"
						)
				);
		ArrayList<Integer> years = new ArrayList<>(
				Arrays.asList(1994, 1972, 1974, 2008, 1957, 
						1993, 2003, 1994, 1966, 1999));
		//testDeleteByName(movies, years);
		//testDeleteByYear(movies, years);
		//testMakeMovieList(movies, years);

	}
}
