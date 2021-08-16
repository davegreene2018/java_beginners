/**
SmartNumberApp.java uses the instantiable class SmartNumber to determine the properties of a number entered by the user.

@author adriana e chis
*/

import java.util.Scanner;
public class SmartNumberApp {

	public static void main(String args[]) {
		// declare a variable to store the user's input
		int n;
		// declare a boolean variable to store the property of a number, i.e. either the number has that property or not
		boolean property;

		Scanner myScanner = new Scanner(System.in); // declare and create an object of type Scanner to allow reading from the keyboard
		// prompt the user to input a number
		System.out.println("please enter an integer number:");
		n = myScanner.nextInt(); // read the number provided by the user

		SmartNumber number = new SmartNumber(); // create an object of type SmartNumber
		// call the method isNumberEven on the object number to find whether the value stored in the variable n is even
		property = number.isNumberEven(n);
		System.out.println("is " + n + " even?: " + property);

		Scanner myScanner2 = new Scanner(System.in); // declare and create object of type Scanner
		// promt the user to input a number
		System.out.println("Please enter an integer number");
		n = myScanner2.nextInt();// read the number provided by the user


		SmartNumber number2 = new SmartNumber(); //. create object of type SmartNumber
		// call the method isNumberOdd on the object number to find out is the number odd
		property = number2.isNumberOdd(n);
		System.out.println("is " + n + " odd?: " + property);

		Scanner myScanner3 = new Scanner(System.in);// declare object of type Scanner
		// prompt the user to enter an integer
		System.out.println("Please enter an integer number");
		n = myScanner3.nextInt();// read the number given

		SmartNumber number3 = new SmartNumber();// create an object of SmartNumber
		// call the method isMultipleOfFive
		property = number3.isNumberMultipleOfFive(n);
		System.out.println("is " + n + " multiple of five " + property);
	}
}
