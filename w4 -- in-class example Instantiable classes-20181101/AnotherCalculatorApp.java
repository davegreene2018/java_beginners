/**
 
 AnotherCalculatorApp
 -- an application to calculate arithmetic operations
 -- uses the instantiable class SimpleCalculator to perform the actual arithmetic operations
 
 @author HDCOMP students & a e chis
 
 
// TODO: practice work: you are required to implement:
	1)in the instantiable class SimpleCalculator methods for the other three arithmetic operations, namely subtraction, multiplication, and division, 
	2) use the methods you implemented in the AnotherCalculatorApp class

 */

// declare a class named AnotherCalculatorApp
public class AnotherCalculatorApp{

	public static void main(String args[]){

		// declare two variables named num1 and num2 both of data type double
		double num1, num2;

		// this class reuses the instantiable class SimpleCalculator to perform the actual arithmetic operations
        // declare a variable of data type SimpleCalculator
		SimpleCalculator sc;
		// create an object of data type SimpleCalculator
		sc = new SimpleCalculator();

		/*     as we now have an object of type SimpleCalculator (that we can use via the 'sc' variable)
         we can call any methods from the instantiable class SimpleCalculator as this is the class from which the object is created.
         in our case, the class SimpleCalculator has currently the following methods setD1(), setD2(), getRes(), add(), and displayMe()
         we can use these methods as many times as we would like to by calling/invoking the methods on a specific object
         */
        
		
		//  use/call/invoke the method displayMe() on the object sc to display its current state (i.e. the values of the object's data members)
		sc.displayMe();

		// input
		// initialize the variable num1 with some value (in this example, the value is hardcoded, however, usually, the input would be provided by the user of this application)
		num1 = 32;
		// use/call/invoke the setter method called setD1() to set/assign the value from num1 variable to the instance variable d1
		sc.setD1(num1);

		// use/call/invoke the method displayMe() on the object sc to display its current state (i.e. the values of the object's data members)
		// what would be the output of the program after the next line is executed?
		sc.displayMe();

		// initialize the variable num2 with some value (in this example, the value is hardcoded, however, usually, the input would be provided by the user of this application)
		num2 = 71;
		// use/call/invoke the setter method called setD2() to set/assign the value from num2 variable to the instance variable d2
		sc.setD2(num2);

		// use/call/invoke the method displayMe() on the object sc to display its current state (i.e. the values of the object's data members)
		// what would be the output of the program after the next line is executed?
		sc.displayMe();

		// processing
		// use/call/invoke the method add() on the object sc
		sc.add();


		// output
		// declare a variable to be able to store the result of the arithmetic operation
		double result;
		// call the getter method getRes() on the object sc to retrieve the result, and store the result in variable named result
		result = sc.getRes();
		// display the result to the user
		System.out.println(result);


		// let's write code to perform another addition on two other numbers, let's say 120 and 75
		/* we can use the same object to perform another arithmetic computation -- think about a pocket calculator -- you only need one device
			to perform as many arithmetic operations you want
		*/
		// 120 + 75
		// store 120 in the variable num1 (in this example, the value is hardcoded, however, usually, the input would be provided by the user of this application)
		num1 = 120;
		// use/call/invoke the setter method called setD1() to set/assign the value from num1 variable to the instance variable d1
		sc.setD1(num1);

		// store 75 in the variable num2 (in this example, the value is hardcoded, however, usually, the input would be provided by the user of this application)
		num2 = 75;
		// use/call/invoke the setter method called setD2() to set/assign the value from num2 variable to the instance variable d2
		sc.setD2(num2);
		
		
		// processing
		// use/call/invoke the method add() on the object sc
		sc.add();
		
		// output
		// call the getter method getRes() on the object sc to retrieve the result, and store the result in variable named result
		result = sc.getRes();
		// display the result to the user
		System.out.println(result);
		
	} // end of main method
	
} // end of class




