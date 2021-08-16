 /*
*Lottery documantation
*@Author Dave Greene
*13-Nov-2018
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;




public class LotteryApp {
	// declare main method
	public static void main (String args[]){

		// create an object of type Scanner
		Scanner input = new Scanner(System.in);

		// create an object of type Random
		Random randomNumber = new Random();

		// create an object of type Lottery
		CheckNumbers checkNumbers = new CheckNumbers();

		// create variables
		int[][]winningNumbers = new int[1][6];
		int[][] myNumbers = new int [3][6];
		int[][] history = new int [3][6];
		String play = "";
		int matches;
		double winnings;


		// loop through winningNumbers array
		for (int i = 0; i < winningNumbers[0].length; i++)
			  {
				  int next = randomNumber.nextInt(15)+1;
				  winningNumbers[0][i] = next;
   			  }
   		Arrays.sort(winningNumbers[0]);
		checkNumbers.setWinningNumbers(winningNumbers);

		// give welcome message
		System.out.println("Welcome to the lotto enter your numbers 1 - 40");


		// loop through myNumbers array *******************
		// One by one sort individual rows.
	    for (int k = 0; k < myNumbers.length; k++)
            Arrays.sort(myNumbers[k]);

		for (int j=0; j<myNumbers.length; j++){// loop through each line
			int lines = j+1;

   			 System.out.println("Line " + lines);
		 for (int k = 0; k <myNumbers[j].length; k++)// loop through numbers
		     {	 int number = k+1;

		         System.out.println("Enter Row " + number +":");
		         myNumbers [j][k] = input.nextInt();



   			 }
		Arrays.sort(myNumbers[j]);
		checkNumbers.setMyNumbers(myNumbers);


	    }

		// end loop through myNumbers ***********************

   		// display our results
   		checkNumbers.displayResults();
		// call check numbers
		checkNumbers.checkNumbers();


	} // close main method


} // close class