/**
 Instantiable classes Lab
 
 Problemn 1
     calculates n to the power of 2
 
 note that this is another implementation of the same problem we solved together in class (during week 3 of classes); in the current implementation we uses setter and getters methods
 
 @author  a e chis
 
 a simple example to demonstrate
 -- how to declare an instantiable class
 -- how to implement a class's attributes/properties/state by declaring instance variables
 -- how to implement a class's behaviour by implementing methods
 -- how to declare a setter method
     --- a setter method is a method which sets/mutates the value of an instance variable.
 -- how to declare a getter method
     --- a getter method is a method which returns/ retrieves the value of an instance variable.
 */

// declare a class named PowerOfTwoV2 -- note that I named this class with a V2 as we have already developed together a solution for this problem which we named PowerOfTwo
public class PowerOfTwoV2 {
	// declare data members/ instance variables
	private int n; // to store a number
	private int result; // to store n to the power 2 (i.e. the square of n)
    
    /*
     declare the constructor without parameters
     this constructor is known as the default constructor or the no-arguments constructor
     if we do not declare ANY constructor in our class, the java compiler generates and inserts in the .class file the default constructor  (i.e. the constructor without parameters)
     */
    public PowerOfTwoV2(){
        // the constructor without parameters initializes all the instance variables  with their default values
        // in our example, the default value is 0 for both n and result as they are declared of int data type
    }
    
    
    // declare a setter method which allows to store a value into the instance variable named n
	public void setN(int number){
        // store in the instance variable n the value of the parameter number
		n = number;
	}
    
    

    // declare a method to calculate n to the power 2
	public void power(){
        // calculate n to the power 2 and save the result in the instance variable named result
		result = n * n;

	}
    
    
    // declare a getter method to return the value of the instance variable result
    public int getResult(){
        return result;
    } // ends getResult()
    

} // ends class


