package murach.games;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // Get upper limit
        System.out.print("Enter the upper limit for the number: ");
        int upperLimit = Integer.parseInt(sc.nextLine());
        System.out.println("OK, I'm thinking of a number between 0 and " +
                upperLimit);
        System.out.println();
        
        // Generate a random number between 0 and the upperLimit variable
        Random random = new Random();
        int number = random.nextInt(upperLimit - 1) + 1;
        
        int count = 1;
        System.out.print("Enter your guess: ");
        int guess = Integer.parseInt(sc.nextLine());
        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guess is too low.\n");
            } else if (guess > number) {
                System.out.println("Your guess is too high.\n");
            }
            count = count + 1;
            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(sc.nextLine());
        }        
        System.out.println("Correct!\n");
        
        System.out.println("You guessed the correct number in " + count +
                " guesses.\n");
        System.out.println("Bye!");
        sc.close();
    }
   
}