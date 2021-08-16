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

		// declare variable of Scanner type
		Scanner input;
		input = new Scanner(System.in);

		// Declare a variable of SimpleCalculator type
		SimpleCalculator sc;
		sc = new SimpleCalculator();

		// get num1 from user
		System.out.println("Enter your first number");
		num1 = input.nextInt();

		// get num2 from user
		System.out.println("Enter your second number");
		num2 = input.nextInt();

        // call/invoke
        sc.setD1(num1);
		sc.setD2(num2);
		sc.add();
		sc.subtract();
		sc.multiply();
		sc.divide();

		// Output for adding
		double result;
		result = sc.getResAdd();
		System.out.println("First number and second number added together = " + result);
		// output for subtracting
		result = sc.getResSub();
		System.out.println("First number subtracted by the second number  = " + result);
		// output for multiply
		result = sc.getResMul();
		System.out.println("First number multiplied by the second number = " + result);
		// output for divide
		result = sc.getResDiv();
		System.out.println("First number divided by the second number = " + result);

	}

}