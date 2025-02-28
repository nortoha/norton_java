package com.norton;

import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message to encode:\n");
		String message = scan.nextLine();
		
		System.out.println("Enter a secret key (-25 to 25):\n");
		int keyVal = Integer.parseInt(scan.nextLine());
		
		// calling the first encoding the book instructed (reversed string)
		//reverseMyString(message);

		// calling the second encoding the book instructed (using a key)
		shiftString(message, keyVal);
				
		// close scanner
		scan.close();
	}

	/**
	 * Adding encoding only letters, not spaces or punctuation
	 * and making the alphabet wrap around 
	 * @param message
	 */
	private static void shiftString(String message, int keyVal) {

		String output = "";
		//char key = 13;  // no longer use this value
		
		// use the value entered by the user
		char key = (char) keyVal;
		
		for(int i=0; i<message.length(); i++) {
			// evaluating this specific char of the message, one at a time
			char input = message.charAt(i);
			
			// check if the character is an uppercase letter, ignore everything else
			if(input >= 'A' && input <= 'Z') {
				// its a letter so add key
				input += key;
				
				// check if you are at the end of the alphabet
				if(input > 'Z') {
					// subtract 26 to wrap back to the beginning index of the alphabet
					input -= 26;
				} 
				// check if you are at the beginning of the alphabet
				if(input < 'A') {
					// add 26 to wrap back to the end index of the alphabet
					input += 26;
				}
			} else if(input >= 'a' && input <= 'z'){
				// now check if it is a lower-case letter
				// its a letter so add key
				input += key;
				
				// check if you are at the end of the alphabet
				if(input > 'z') {
					// subtract 26 to wrap back to the beginning index of the alphabet
					input -= 26;
				}
				// check if you are at the beginning of the alphabet
				if(input < 'a') {
					// add 26 to wrap back to the end index of the alphabet
					input += 26;
				}
				
				// now check if it is a digit
			} else if(input >= '0' && input <= '9') {
				// its a digit, mod 10
				input += (keyVal % 10);
				
				if(input > '9') {
					input -= 10;
				}
				if(input < '0') {
					input += 10;
				}
						
			}
			
			// reconstruct the output string
			output += input;
		}
		
		System.out.print("Shifted Message: ");
		System.out.println(output);

	}

	private static void reverseMyString(String message) {

		String output = "";
		// this loop will reverse the string
		// initilize i to the length of the message -1
		// condition - if i is greater than or equal 0
		// then subtract one from i (i--)
		for(int i=message.length()-1; i>=0; i--) {
			output += message.charAt(i);
		}
		
		System.out.print("Reversed Message: ");
		System.out.println(output);
		
	}
}
