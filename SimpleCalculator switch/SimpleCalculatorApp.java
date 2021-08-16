/**
*SimpleCalculator Documantation
*@Author Dave Greene
*08-Oct-2018
*
*/
import java.util.Scanner;

public class SimpleCalculatorApp {
	public static void main(String args[]){

		// Declare variables
		double num1, num2;
		String operation;

		// declare variable of Scanner type
		Scanner input;
		input = new Scanner(System.in);

		// Declare a variable of SimpleCalculator type
		SimpleCalculator sc;
		sc = new SimpleCalculator();

		// get num1 from user
		System.out.println("Enter your first number");
		num1 = input.nextInt();

		// select the operation  required
		System.out.println("Enter the operation required ie * / + -");
		operation = input.nextLine();


		// get num2 from user
		System.out.println("Enter your second number");
		num2 = input.nextInt();

        // call/invoke
        sc.setD1(num1);
		sc.setD2(num2);
		sc.setOperation(operation);


		// Output for adding

	}

}