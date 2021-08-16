/** Documantation */

import java.util.Scanner;

public class CalculateLiters {

	public static void main(String args[]) {

		Scanner input;

		double milliliters;
		double liters;
		double pints;
		double remainder;

		System.out.println("Please enter the total amount in milliliters");
		input = new Scanner(System.in);
		milliliters = input.nextInt();

		// convert to liters
		liters = milliliters/1000;
		// convert to pints
		pints = liters * 2.11;

		// display to the user the total liters and pints
		System.out.println("You have " + liters + " liters which is = to " + pints + " pints");



	}





}// end class