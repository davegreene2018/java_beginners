/** instantiable class SimpleCalculator -- a class to perform basic arithmetic computations

a simple example to demonstrate 
    -- how to declare an instantiable class
    -- how to implement a class's attributes/properties/state by declaring instance variables
	-- how to implement a class's behaviour by implementing methods (e.g. add)
    -- how to declare a setter method (e.g. setD1, setD2)
            --- A setter method is a method which sets/mutates the value of an instance variable.
    -- how to declare a getter method (e.g. getRes)
            --- A getter method is a method which returns/ retrieves the value of an instance variable.
			
@author HDCOMP students & a e chis

// TODO: practice work: you are required to implement:
	1)in the instantiable class SimpleCalculator methods for the other three arithmetic operations, namely subtraction, multiplication, and division, 
	2) use the methods you implemented in the AnotherCalculatorApp class
	
	
*/

// declare a class named SimpleCalculator
public class SimpleCalculator {

	/* declare instance variables /data members/ fields -- to represent the state/properties/attributes of the objects */
	
	// declare an instance variable to store the first number; the instance variable is of type double and is named d1
	private double d1; // input
	// declare an instance variable to store the second number; the instance variable is of type double and is named d2
	private double d2; // input
	
	// declare an instance variable to store the result of an arithmetic operation; the instance variable is of type double and is named res
	private double res; // output

	
	 /* declare methods -- to implement behaviour/actions/operations */
    
	
    // declare setter methods
    // declare a setter method which enables to store a value into the instance variable named d1
	public void setD1(double value){
		// store in the instance variable d1 the content of the parameter value
		d1 = value;

	}

	
	// declare a setter method which enables to store a value into the instance variable named d2
	public void setD2(double num){
		// store in the instance variable d2 the value of the parameter num
		d2 = num;
	}
	
	
	// declare getter methods
    // declare a getter method to return the value of the instance variable res
	public double getRes(){
		// returns the value of the instance variable res
		return res;
	}
	

	// declare methods-- each method describes one behaviour/ task the objects know to perform
    
    // declare a method to perform the addition
	public void add(){
		 // add the value of d1 and d2 and assign (i.e. store) the result into the instance variable named res
		res = d1 + d2;
	}
	
	public void subtract(){
		res = d1 - d2;
	}
	
	public void multiply(){
		res = d1 * d2;
	}
	
	public void divide(){
		res = d1 / d2;
	}

	
	
	public void displayMe(){
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(res);
		System.out.println();
	}  // end of method displayMe()

} // end of class

