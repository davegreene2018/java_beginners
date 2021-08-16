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
	int[][] history = new int [999][6];



	// set winning numbers
	public void setWinningNumbers(int[][] value) {
		this.winningNumbers = value;
	}




	// set my numbers
		public void setMyNumbers(int[][] value) {
			this.myNumbers = value;
	}

	public int[][] getMyNumbers(){
		return myNumbers;
	}


	// check to see if we have any matching numbers
	public void checkNumbers (){

			int lineCounter;
			lineCounter = 0;
			int winningsLine;
		    winningsLine = 0;

		    int line;
		    line = 0;


			// loop through line 1 to check against winning numbers
			for(int row = 0; row<myNumbers.length; row++){
				lineCounter = 0;
				winningsLine = 0;
				for(int col =0; col< myNumbers[row].length; col++){
					for(int wcol =0; wcol< winningNumbers[0].length; wcol++){
						if(myNumbers[row][col] == winningNumbers[0][wcol]){
							lineCounter++;
							}
						}

					}

			line++;
			// compare matches for line 1 and store the winnings in winningsLine
			if(lineCounter==3){
				winningsLine = winningsLine + 100;
			}else if(lineCounter==4){
				winningsLine = winningsLine + 250;
			}else if(lineCounter==5){
				winningsLine = winningsLine + 1000;
			}else if(lineCounter==6){
				winningsLine = winningsLine + 6000000;
			}else {
				winningsLine = 0;
					}

			System.out.println("Line "+line + " you have " +lineCounter + " matches, total Winnings = " + winningsLine);


				}


		 }// close checkNumbers


		public void displayNumbers (){

		 	System.out.println("");
		 	System.out.println("Tonights winning numbers are");
		 	System.out.println(Arrays.deepToString(winningNumbers).replace("[[","[").replace("],","]").replace("]]","]"));  // display winning numbers
		 	System.out.println("");
		 	System.out.println("Your numbers");
		 	System.out.println(Arrays.deepToString(myNumbers).replace("[[","[").replace("],","]").replace("]]","]")); // display numbers chosen


		  	}




}