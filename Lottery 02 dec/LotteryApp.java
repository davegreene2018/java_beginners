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

		// create an object of type CheckNumbers
		CheckNumbers checkNumbers = new CheckNumbers();

	    // create an object of type Random
	    Random randomNumber = new Random();

		// create variables
		int[][]winningNumbers = new int[1][6];
		int[][] myNumbers = new int [3][6];
		String playAgain ="yes";
		String anotherLine ="yes";
		int gameNumber =1;
		int lineCounter =0;


		 // loop through winningNumbers array
		 for (int i = 0; i < winningNumbers[0].length; i++){
			  	 int next = randomNumber.nextInt(15)+1;
			  	 winningNumbers[0][i] = next;
			  }
		Arrays.sort(winningNumbers[0]);
		checkNumbers.setWinningNumbers(winningNumbers);


		// give welcome message
		System.out.println("Welcome to the lotto enter your numbers 1 - 40");

		while(playAgain.equals("yes") && anotherLine.equals("yes")){


		// loop through myNumbers array *******************
		// One by one sort individual rows.





		for (int j=0; j<3; j++){// loop through each line
			int lines = j+1;

while(playAgain.equals("yes") && anotherLine.equals("yes")){
   			System.out.println("Line " + lines);
		 for (int k = 0; k <myNumbers[j].length; k++)// loop through numbers

		     {	 int number = k+1;


		         System.out.println("Enter Row " + number +":");

		         myNumbers [j][k] = input.nextInt();
		        checkNumbers.setMyHistory(myNumbers);





   			 }

   			 System.out.println("Would you like to play another line type yes or no");
			 			 				 		 					anotherLine ="no";

	}


        anotherLine = input.nextLine();
        if(anotherLine.equals("yes")){
					j= j-1;
					lineCounter = lineCounter+1;
					checkNumbers.setLineCounter(lineCounter);


		}else if(anotherLine.equals("no")){
			j= j;
		}
		Arrays.sort(myNumbers[j]);
		checkNumbers.setMyNumbers(myNumbers);




/// closed while


	    }// end loop through myNumbers






   		// display our results
   		checkNumbers.displayNumbers();

		System.out.println("Would you like to play another game type yes or no");
		playAgain = "no";
		playAgain = input.nextLine();
		        if(playAgain.equals("yes")){
							playAgain = "yes";
							anotherLine = "yes";
							gameNumber = gameNumber+1; // keep track of each game;
							lineCounter = lineCounter+1;
							checkNumbers.setGameNumber(gameNumber);
		}else if (playAgain.equals("no")){
			checkNumbers.displayWinningNumbers();
			      // call check numbers
	  checkNumbers.checkNumbers();
	  checkNumbers.displayHistory();
	  System.out.println(lineCounter);

			}



}// close while


	} // close main method


} // close class