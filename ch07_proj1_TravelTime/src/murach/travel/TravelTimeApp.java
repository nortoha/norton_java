package murach.travel;

import java.util.Scanner;

// we will use integer division to divide time into hours and minutes
public class TravelTimeApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Travel Time Calculator");
        System.out.println();  // print a blank line

        // create the Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
            // ask for input from the user
            System.out.print("Enter miles:           ");
            // read input from the user
            double miles = Double.parseDouble(sc.nextLine());
            
            // ask for input from the user
            System.out.print("Enter miles per hour:  ");
            // read input from the user
            double mph = Double.parseDouble(sc.nextLine());
            // blank line
            System.out.println();

            // calculate the travel time in hours with decimal division 
            double hoursDec = miles / mph;
            System.out.println("Hours as Decimal:   " + hoursDec);
            
            // convert hours into minutes as an int
            int minutes = (int) (hoursDec * 60);
            System.out.println("Total time in minutes: " + minutes);
            
            // use integer arithmetic to get hours and minutes as int values
            // how many whole hours can we get from the minutes (division)
            int hoursInt = minutes / 60;
            // the remainder of that division is the minutes (modulus)
            minutes = minutes % 60;

            // display the result
            System.out.println("Estimated travel time");
            System.out.println("Hours:   " + hoursInt);
            System.out.println("Minutes: " + minutes);
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}