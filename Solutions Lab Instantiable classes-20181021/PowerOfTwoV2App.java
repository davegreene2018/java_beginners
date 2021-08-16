
/**
 Instantiable classes Lab
 
 Problemn 1
 calculates n to the power of 2
 
 @author a e chis
 
 PowerOfTwoV2App uses the instantiable class PowerOfTwoV2 to perform the actual computations i.e. processing
 */

import java.util.Scanner;

public class PowerOfTwoV2App{

	public static void main(String args[]){

		// declare variables
        // declare a variable of type int named num -- this will store the input provided by the user
		int num;
        
        // declare a variable of type Scanner, and create an object of type Scanner
        Scanner input = new Scanner(System.in);
        
        
		// declare a variable of type PowerOfTwoV2
		PowerOfTwoV2 myObj;
		// create an object of type PowerOfTwoV2, using the default constructor/ the no-args constructor i.e. PowerOfTwoV2()
		myObj = new PowerOfTwoV2();

		// input
        // prompt the user to provide a number
		System.out.println("enter a number:");
		num = input.nextInt(); // read the integer number from the keyboard and store it in variable num
        // use the setter method named setN() to set/assign the number provided by the user to the instance variable (named n) of the object myObj
        myObj.setN(num);

		// processing
		myObj.power();

		// output
        // declare a variable to be able to store the result
		int res;
        // call the getter method getResult() to retrieve the result, and store the result in variable res
		res = myObj.getResult();
        // display the result
		System.out.println(res);

        // alternatively, we could display the result by calling the getter method getRes() within the println() method
        // note that following code is going to display the same result as the code on lines 44-48
		//System.out.println(myObj.getResult());

	} // ends class
    
} // ends main


