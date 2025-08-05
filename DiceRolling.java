//DiceRolling.java - This programs runs rolls dice 12 times randomly. 
//CSIS 212-B02
// Class Random: https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

package dicerolling;

import java.util.Random;                 // import programs uses of class random 
import java.util.Scanner;          		//  Import program uses of class scanner

public class DiceRolling {
	// Main method beings execution of Java application
    public static void main(String[] args) {

        Random randomNumbers = new Random();  // c=Create Random object
        Scanner input = new Scanner(System.in);  // Scanner for user input

        String runAgain;  // Holds user choice if they want to repeat

        // Loop to run the program again
        do {
            int[] frequency = new int[13];  // Array to count sums 2 through 12 

            // Roll the dice 36,000 times
            for (int roll = 1; roll <= 36000; roll++) {

                // First Dice roll, 1-6
                int die1 = 1 + randomNumbers.nextInt(6);

                //  Second Dice roll, 1-6
                int die2 = 1 + randomNumbers.nextInt(6);

                // Sum of Die1 and Die2
                int sum = die1 + die2;

                // Increment the count
                frequency[sum] = frequency[sum] + 1;
            }

            // Display results
            System.out.println("Sum\tFrequency");

            // Loop 2-12 sums
            for (int sum = 2; sum <= 12; sum++) {
                System.out.printf("%d\t%d%n", sum, frequency[sum]);
            }

            // Ask if they would like to run this again
            System.out.println("David Lyman – Assignment 5\n");
            System.out.print("Do you want to run again? Type yes or no: ");
            runAgain = input.next();
            
        } while (runAgain.equalsIgnoreCase("yes"));  // Will repeat if input is "yes"
    } // End of Main Method
} //End of Class CircleArea