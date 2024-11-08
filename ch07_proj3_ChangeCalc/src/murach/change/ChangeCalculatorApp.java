package murach.change;

import java.util.Scanner;

public class ChangeCalculatorApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Change Calculator");
        System.out.println();  // print a blank line

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform conversions until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // ask user for the number of cents from the user
            System.out.print("Enter number of cents (0-99): ");
            // read the number as an int
            int cents = Integer.parseInt(sc.nextLine());
            System.out.println();

            // calculate the number of quarters
            int quarters = cents / 25;  // get number of quarters
            cents %= 25;                // assign the remainder to the cents variable

            // calculate the number of dimes
            int dimes = cents / 10;  // get number of dimes
            cents %= 10;             // assign the remainder to the cents variable

            // calculate the number of nickels and pennies
            int nickels = cents / 5;  // get number of nickels
            int pennies = cents % 5;  // get number of pennies

            // display the results
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes:    " + dimes);
            System.out.println("Nickels:  " + nickels);
            System.out.println("Pennies:  " + pennies);
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}