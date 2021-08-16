
/**
 CalculatorIfApp
 -- prompts the user to
	--- specify the operation to be performed (e.g. addition, subtraction, multiplication, division)
	--- specify the two numbers
 -- computes the user's selected operation by using if else if selection statements to decide the arithmetic operation to be performed based on the input received from the user
 -- reuses the instantiable class SimpleCalculator to perform the actual arithmetic computation
 -- displays the result
 
 
 @author HDCOMP students & a e chis
 */

 
import java.util.Scanner;

public class CalculatorIfApp{

	public static void main(String args[]){
		
		// declare local variables
        
		// declare a variable of type Scanner, and create an object of type Scanner
		Scanner in = new Scanner(System.in);

		// declare 2 variables to store the numbers
		double n1, n2;
		// declare a variable to store the user's choice i.e. operation to be performed
		int op;

		// input
		// prompt the user to specify the operation to be performed
		System.out.println("Choose an operation (by specifying its corresponding number)");
		System.out.println(" 1 - add");
		System.out.println(" 2 - subtract");
		System.out.println(" 3 - multiply");
		System.out.println(" 4 - divide");
		// read the operation the user wants to perform
		op = in.nextInt(); // reads and returns one int value

	

		// prompt the user to enter the two numbers
		// prompt the user to enter the first number
		System.out.print("number 1: ");
		n1 = in.nextDouble(); // read the first number
   
		// prompt the user to enter the second number
		System.out.print("number 2: ");
		n2 = in.nextDouble();  // read the second number

		// declare a variable of type SimpleCalculator
		SimpleCalculator myCalc;
		// create an object of type SimpleCalculator using the no-args constructor (default constructor)
		myCalc = new SimpleCalculator();
		// call/invoke/use the setter method setD1() to store the value of n1 in the object's instance variable named d1
		myCalc.setD1(n1);
		// call/invoke/use the setter method setD2() to store the value of n2 in the object's instance variable named d2
		myCalc.setD2(n2);

		// process
		// user's choice is stored in the variable op
		// use the if else if selection statements to decide the arithmetic operation to be performed based on the user's input
		if (op == 1){ // if op is equal to 1 (i.e. the user entered 1) then execute the next statements				
			// addition
			// call/invoke/use method add() on the object to perform the addition
			myCalc.add();	
			
		} else if (op == 2){ // if op is equal to 2 (i.e. the user entered 2) then execute the next statements
			// call/invoke/use method subtract() on the object to perform the subtraction
			myCalc.subtract();
		} else if (op == 3){
			// call/invoke/use method multiply() on the object to perform the multiplication
			myCalc.multiply();
		} else if (op == 4) {
			// call/invoke/use method divide() on the object to perform the division
			myCalc.divide();
		} else { // the value of op is not 1, 2, 3 or 4
			System.out.println("unknown operation");
		} // ends if else if statement

		// output
		double result;
		// use the getter method getRes() to retrieve the result of the arithmetic operation, and store it in the variable named result
		result = myCalc.getRes();
		// display the result of the operation
		System.out.println(result);
		
		

	} // ends the main method
    
} // ends the body of the class