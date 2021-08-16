/** reuse instantiable class PowerOfTwo */
import java.util.Scanner;

public class PowerOfTwoApp {

	// main method
	public static void main(String args []){
		// declare variable of Scanner type
		Scanner banana;
		// create an object of type scanner
		banana = new Scanner(System.in);

		// input
		int number;
		// promt the user to enter a number
		System.out.println("Please enter a whole number");
		number = banana.nextInt();

		// processing
		// declare a variable
		PowerOfTwo myObj;
		myObj = new PowerOfTwo();

		// call/invoke method
		myObj.square(number);


		// output
		myObj.displayMe();





	}

}