import java.util.Scanner;

/**
 * @author Holly Norton
 */
public class HiLo_CountingTries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String playAgain = "";
		
		do {
			
			// Create a random number for the user to guess between -100 and 100
			int theNumber = (int) (Math.random()*200 +1); //add 1 to get numbers 1 to 200
			theNumber = theNumber - 100; // subtract 100 to get a range of -100 to 100
			// System.out.println(theNumber);
			
			int guess = 0;
			int numberOfTries = 0;
			
			while(guess != theNumber) {
				
				System.out.println("Guess a number between -100 and 100: ");
				guess = scan.nextInt();
				// increment the number of tries counter
				numberOfTries = numberOfTries + 1;
				
				if(guess < theNumber) {
					System.out.println(guess + " is too low. Try again.");
				} else if(guess > theNumber) {
					System.out.println(guess + " is too high. Try again.");
				} else {
					System.out.print(guess + " is correct.  You won with " + numberOfTries);
					if(numberOfTries==1) {
						System.out.println(" try!");
					} else {
						System.out.println(" tries!");
					}
				}
			} // end while
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
			
		} while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing!! Goodbye!");
		scan.close();
	}

}
