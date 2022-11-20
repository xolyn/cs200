///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           LoginAndSignup
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Derived from Laura "Hobbes" Legault, CS 301 Sp 16
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoginAndSignup {
	
	
	/**
	 * readFromFile method will read from the database file and save all usernames, 
	 * passwords, and keys in the corresponding ArrayLists.If the file cannot open,
     * output error message: <dbName> cannot open!
	 * @param dbName The file name to save all users, passwords, and keys
	 * @param users
	 * @param pwds
	 * @param keys
	 */
	public static void readFromFile(String dbName, ArrayList<String> users,
									ArrayList<String> pwds, ArrayList<Integer> keys){
		try {
			File fileByteStream= new File(dbName);
			Scanner inFS= new Scanner(fileByteStream);
			boolean hnl=true;
			//fileByteStream = new FileInputStream(dbName);
			//inFS = new Scanner(fileByteStream);
			//users.add(inFS.next());
			//pwds.add(inFS.next());
			//keys.add(inFS.nextInt());
			do{
				users.add(inFS.next());
				pwds.add(inFS.next());
				keys.add(inFS.nextInt());
				if(!inFS.hasNextLine()){hnl=false;}
			}while(hnl);
		}catch(Exception FileNotFoundException){System.out.println(dbName+ " cannot open");}
		}

	/**
	 * writeToFile method write the username password and key back to the file
	 * The username and its corresponding encrypted password and key are written in the same line.
	 * Use tab to separate each of them. If the file cannot open,
     * output error message: <fileName> cannot open!
	 * @param fileName
	 * @param users
	 * @param encryptedpwds
	 * @param keys
	 */
	public static void writeToFile(String fileName, ArrayList<String> users,
								   ArrayList<String> encryptedpwds, ArrayList<Integer> keys)
									{
		try{
		File fileStream= new File(fileName);
		PrintWriter outFS= new PrintWriter(fileStream);



				for (int i = 0; i < users.size(); i++) {
					outFS.println(users.get(i) + "\t" + encryptedpwds.get(i) + "\t" + keys.get(i));
				}
		outFS.close();

		}catch(Exception FileNotFoundException)
		{System.out.println(fileName+ " cannot open");}


		
	}
	/**
	 * Encrypt the password - shift all the character in the password to the right for key position
	 * @param password
	 * @param key
	 * @return an encrypted password 
	 */
	
	public static String pwdEncryption(String password, int key) {
		
		return null;
	}
	
	/**
	 * Decrypt the password - left shift the encrypted password to key position
	 * @param encryptedPassword
	 * @param key
	 * @return the original password
	 */
	public static String pwdDecryption(String encryptedPassword, int key){
		
		return null;
	}
	/**
	 * Check whether the username and password are correct
	 * if the username does not exist, return "Invalid username"
	 * if the username exists but the password is incorrect, return "Invalid password"
	 * if the username exists and password is correct, return "Successful login"
	 * 
	 * @param users ArrayList contains all usernames
	 * @param pwds ArrayList contains all passwords
	 * @param keys ArrayList contains all keys to encrypt and decrypt
	 * @param userName 
	 * @param password
	 * @return String a message to indicate the login result
	 */
	public static String login (ArrayList<String> users, ArrayList<String> pwds, ArrayList<Integer> keys, String userName, String password) {
		
		return null;
	}
 /**
	 * This method is used for signup
	 * If the newUsername already exists, then the signup action fails and return "Invalid username"
	 * Else signup action succeed and add username, encrypted password and the key to the corresponding ArrayList.
    * return "Successful signup"
	 * @param rand Random instance to generate a random key. The key should in range of [1, 20]
	 * @param users ArrayList contains all usernames
	 * @param pwds ArrayList contains all passwords
	 * @param keys ArrayList contains all keys to encrypt and decrypt
	 * @param newUser new username
	 * @param newPwd new password
	 * @return String a message to indicate the signup result
	 */
	public static String signup(Random rand, ArrayList<String> users, ArrayList<String> pwds, ArrayList<Integer> keys, String newUser, String newPwd) {
		
		return null;
	}
	/**
	 * Determine whether the new username exists
	 * @param newUser
	 * @param users
	 * @return boolean true if the newUser doesn't exist
	 * 				   false if the newUser already exists
	 */
	public static boolean uniqueUser(String newUser, ArrayList<String> users) {
		
		return false;
	}
	
	public static void main(String[] args) {
		
		
	}

}
