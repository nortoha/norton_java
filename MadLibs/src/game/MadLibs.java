package game;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String playAgain = "";
		
		do {
			
			// play the game
			System.out.println("Welcome to MadLibs!!  Let's play.");
			
			String color = "";
			System.out.println("Enter a color: ");
			color = scan.next();
			
			String pastTenseVerb = "";
			System.out.println("Enter a past tense verb: ");
			pastTenseVerb = scan.next();
			
			String adjective = "";
			System.out.println("Enter an adjective: ");
			adjective = scan.next();
			
			// ask for more....
			
			
			System.out.print("\nThe " + color + " dragon " + pastTenseVerb + " at the ");
			System.out.println(adjective + " knight.");
			
			
		} while(playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for playing!! Goodbye!");
		scan.close();
		
	}

}
