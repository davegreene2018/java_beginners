import java.util.Scanner;

public class RainfallApp {
	// declare main method
	public static void main(String args[]){

		// create an object of type Scanner
		Scanner input = new Scanner(System.in);

		// declare variables
		int weeks;
		int days;
		weeks = 4;
		days = 7;

		double rainfall[][];
		rainfall = new double[weeks][days];

		// traverse the array to populate it
		for (int row =0; row<rainfall.length; row++){

			// retrieve the currant row
			double[] currRow = rainfall[row];
			for (int col = 0; col<currRow.length; col++){
				System.out.println("week: " + (row+1) + " day: " + (col+1) );
				rainfall[row][col] = input.nextDouble();

			}


		}

		double sum;
		int elementsCounter;
		elementsCounter = 0;
		sum = 0;

		for(int row =0; row< rainfall.length; row++){
			for(int col =0; col< rainfall[row].length; col++){
				sum = sum + rainfall[row][col];
				elementsCounter++;

			}
		}
		double avg = sum/elementsCounter;
		System.out.println("Average = " + avg);

	}


}