/**
Calculate.java documantation
@Author Dave Greene
21-Oct-2018
*/
import java.util.Scanner;

public class CalculateApp {
	// declare the main method
	public static void main(String args[]){
		// declare instance variables
		int num1; // hold the value of number 1
		int num2; // hold the value of number 2

		// create object of type Scanner
		Scanner input = new Scanner(System.in);

		// create object of type Calculate
		Calculate myCalc;
		myCalc = new Calculate();

		// prompt the user to enter the first number
		System.out.println("Enter first number:");
		num1 = input.nextInt();
		myCalc.setNum1(num1);

		// prompt the user to enter the second number
		System.out.println("Enter second number:");
		num2 = input.nextInt();
		myCalc.setNum2(num2);

		// process
		myCalc.multiply();

		// display the result to the user
		int result;
		result = myCalc.getResult();
		System.out.println(result);


	}


}