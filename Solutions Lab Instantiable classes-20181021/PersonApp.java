/**
 PersonApp.java demonstrates
 -- how to reuse the instantiable class Person
 -- how to create several objects/instances of class Person and
 -- how to use the constructors to initialize an object's attributes/ properties/ state
 -- how to call/invoke an object's method (i.e. displayMe()) to perform its tasks
 
 
 @author HDCOMP students and a e chis
 */

// declare the class named PersonApp
public class PersonApp{

	// declare the main method
	public static void main(String args[]){

		// declare a variable of data type Person
		Person p1;
		
		/// create an object/instance of type Person using the constructor without any parameters
        /* if we use the no-arguments constructor, during the program execution Java will
         create and save in memory an object with all its instance variables initialized to their default values, for the Person object they are:
			 -- name is initialized with null
			 -- age is initialized with 0
			 -- enjoysReading is initialized with false
         */
		p1 = new Person();

		// invoke/call the method displayState() on the object created above -- the method will display the object's instance variables
		p1.displayState();

		// declare another variable of type Person
		Person p2;
		// declare variables and initialize them to some value, note that usually we would ask the user to provide this values, for example via keyboard
		String n = "john smith";
		int a = 40;
		boolean reads = true;
		// create an object of type Person using the constructor with 3 parameters
        /* in this case, during the program execution Java will
		 create and save in memory an object with its instance variables initialized as follows:
			 -- name is initialized with "john smith"
			 -- age is initialized with 40
			 -- enjoysReading is initialized with true
         */
		p2 = new Person(n, a, reads);
		// call/invoke the method displayState() on the object created above -- the method will display the object's instance variables
		p2.displayState();

		// declare a variable of type Person
		Person p3;
		n = "emma murphy";
		reads = false;
		// create an object of type Person using the constructor with 2 parameters
        /* in this case, during the program execution Java will
         create and save in memory an object with its instance variables initialized as follows:
			 -- name is initialized with "emma murphy"
			 -- age is initialized with 0
			 -- enjoysReading is initialized with false*/
		p3 = new Person(reads, n);
		// call/invoke the method displayState() on the object created above -- the method will display the object's instance variables
		p3.displayState();

		// declare a variable of type Person
		Person p4;
		n = "mike johnson";
		 // create an object of type Person using the constructor with 1 parameter
        /* in this case, during the program execution Java will
         create and save in memory an object with its instance variables initialized as follows:
			 -- name is initialized with "mike johnson"
			 -- age is initialized with 0
			 -- enjoysReading is initialized with false*/
		p4 = new Person(n);
		// call/invoke the method displayState() on the object created above -- the method will display the object's instance variables
		p4.displayState();

	}
}