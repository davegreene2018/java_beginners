/** */

import java.util.Scanner;

public class EggsApp {
	// main method
	public static void main(String args[]){
		// declare variables
		int totalEggs;

	    Scanner userInput;
        // input
		System.out.println("Joe enter how many eggs you have collected");
		userInput = new Scanner(System.in);
		totalEggs = userInput.nextInt();

		// invoke/call
		Eggs totalBoxes;
		totalBoxes = new Eggs();

		totalBoxes.boxs(totalEggs);

		totalBoxes.displayMe();




	}

}