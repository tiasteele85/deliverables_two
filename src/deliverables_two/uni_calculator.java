/*Author: Tia Steele
 * Java Bootcamp prework deliverable_two:Unicode Calculator
 * Date: 5/23/2019
 */

package deliverables_two;

import java.util.Scanner;

public class uni_calculator {

	public static void main(String args[]) {
		// Declare variables
		String str1; // temp variable to hold user string
		String str2; // temp variable to hold user second string
		int tempValue = 0; // temp value to cast each character
		int totalFirst = 0; // variable to hold the total for the first string
		int totalSecond = 0; // variable to hold the total for the second string
		int absoluteValue = 0; // variable to hold the calculated difference
		String flare = "**************************************************";

		Scanner in = new Scanner(System.in);

		// User Experience, explaining purpose of program
		System.out.println("This program is designed to take two strings and\n"
				+ "calculate a numeric value and print the difference.\n"
				+ "Type when prompted and hit enter when finished " + "typing each string.");
		System.out.println(flare + "\n");

		// Request user input
		System.out.println("Enter something:");
		str1 = in.nextLine();
		str2 = in.nextLine();

		// Calculate value of first string
		for (int acc = 0; acc < str1.length(); acc++) {
			tempValue = (int) str1.charAt(acc);
			totalFirst += tempValue;

		}

		// Calculate value of second string
		for (int acc = 0; acc < str2.length(); acc++) {
			tempValue = (int) str2.charAt(acc);
			totalSecond += tempValue;

		}

		// Calculate Absolute Value
		absoluteValue = Math.abs((totalFirst - totalSecond));

		// Print Absolute Value to Console
		System.out.print("\nThe difference is: ");
		System.out.println(absoluteValue);

	}
}
