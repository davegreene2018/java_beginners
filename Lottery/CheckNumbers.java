 /*
  *CheckNumbers documantation
  *@Author Dave Greene
  *24-Nov-2018
  */
import java.util.Arrays;

public class CheckNumbers {

	// declare variables
	int[][] winningNumbers = new int[1][6];
	int[][] myNumbers = new int [3][6];
	int[][] history = new int [3][6];


	// set winning numbers
	public void setWinningNumbers(int[][] value) {
		this.winningNumbers = value;
	}


	// set winning numbers
		public void setMyNumbers(int[][] value) {
			this.myNumbers = value;
	}


		// check to see if we have any matching numbers
		public void checkNumbers (){

			int line1Counter;
			line1Counter = 0;
			int line2Counter;
			line2Counter = 0;
			int line3Counter;
			line3Counter = 0;


			// loop through line 1 to check against winning numbers
			for(int col =0; col< myNumbers[0].length; col++){
				for(int wcol =0; wcol< winningNumbers[0].length; wcol++){
				   	if(myNumbers[0][col] == winningNumbers[0][wcol]){
				   		line1Counter++;

			 				}
						 }
					}
			// loop through line 2 to check against winning numbers
			for(int col =0; col< myNumbers[1].length; col++){
				for(int wcol =0; wcol< winningNumbers[0].length; wcol++){
				  	if(myNumbers[1][col] == winningNumbers[0][wcol]){
						line2Counter++;
							}
						}
					}
			// loop through line 3 to check against winning numbers
			for(int col =0; col< myNumbers[2].length; col++){
				for(int wcol =0; wcol< winningNumbers[0].length; wcol++){
				   	if(myNumbers[2][col] == winningNumbers[0][wcol]){
				   		line3Counter++;
							}
						}
					}


			// compare matches for line 1 and store the winnings in winningsLine1
			int winningsLine1;
			winningsLine1 = 0;


			if(line1Counter==3){
				winningsLine1 = winningsLine1 + 100;
			}else if(line1Counter==4){
				winningsLine1 = winningsLine1 + 250;
			}else if(line1Counter==5){
				winningsLine1 = winningsLine1 + 1000;
			}else {
		 		winningsLine1 = 0;
			}

			// compare matches for line 2 and store the winnings in winningsLine2
			int winningsLine2;
			winningsLine2 = 0;

			if(line2Counter==3){
				winningsLine2 = winningsLine2 + 100;
			}else if(line2Counter==4){
				winningsLine2 = winningsLine2 + 250;
			}else if(line2Counter==5){
				winningsLine2 = winningsLine2 + 1000;
			}else {
				winningsLine2 = 0;
			}

			// compare matches for line 3 and store the winnings in winningsLine3
			int winningsLine3;
			winningsLine3 = 0;

			if(line3Counter==3){
				winningsLine3 = winningsLine3 + 100;
			}else if(line3Counter==4){
				winningsLine3 = winningsLine3 + 250;
			}else if(line3Counter==5){
				winningsLine3 = winningsLine3 + 1000;
			}else {
				winningsLine3 = 0;
			}



			System.out.println("Line 1 you have " +line1Counter + " matches, total Winnings = " + winningsLine1);
			System.out.println("Line 2 you have " +line2Counter + " matches, total Winnings = " + winningsLine2);
			System.out.println("Line 3 you have " +line3Counter + " matches, total Winnings = " + winningsLine3);


		 }// close checkNumbers

		// display our results
		public void displayResults (){
		// display winning numbers
		System.out.println("");
		//Arrays.sort(winningNumbers);// sort numbers in order
		System.out.println("Tonights winning numbers are");
		System.out.println(Arrays.deepToString(winningNumbers).replace("[[","[").replace("],","]").replace("]]","]"));
		// display numbers chosen
		System.out.println("");
		System.out.println("Your numbers");
		System.out.println(Arrays.deepToString(myNumbers).replace("[[","[").replace("],","]").replace("]]","]"));


	}













}