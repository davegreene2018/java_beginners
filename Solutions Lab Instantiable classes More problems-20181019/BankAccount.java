/**
Lab5: Instantiable Classes - More Problems

Problem 2
Develop an application which consists of two classes, the instantiable class
BankAccount and the application class BankAccountApp.
	- TheBankAccount instantiable class should would represent any bank account that we can open at a bank.
	- The BankAccountApp class contains the main method and will create objects of type BankAccount to demonstrate the capabilities of the BankAccount.
	
Hint: To develop the instantiable class, first, think about the properties/attributes of a bank account. Next, think what are the operations that can be performed on a bank account?

@author  a e chis

BankAccount 
a simple example to demonstrate 
    -- how to declare an instantiable class
    -- how to implement a class's attributes/properties/state by declaring instance variables
	-- how to implement a class's behaviour by implementing methods
	-- how to declare a constructor
    		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
    -- how to declare a setter method
            --- A setter method is a method which sets/mutates/changes the value of an instance variable.
    -- how to declare a getter method
            --- A getter method is a method which returns/ retrieves the value of an instance variable.
*/


// declare a class named BankAccount
public class BankAccount {
	
	// declare instance variables
	private String name; // to store the name of the owner
	private double balance; // to store the balance
	
	
	// constructors: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created	
	// declare multiple constructors -- in OOP, when we declare multiple constructors in the same class we *overload constructors*
	// the signature of the overloaded constructors must be different i.e. we cannot have 2 constructors with the same signature (please see the examples below)
		
	// declare a constructor with 2 parameters	
	public BankAccount(double amount, String name){
    	// initialize the instance variables with the values provided by the user of this class (the user of this class is another class -- i.e. the class where we create the objects of type BankAccount)
    	
		// initialize the instance variable balance with the value of the parameter amount
		//this.balance = amount;
		balance = amount;
		// initialize the instance variable name (i.e. this.name) with the value of the parameter name
		this.name = name;
	}
	
	 
	// declare the constructor without parameters
	/* NOTE this constructor is known as the default constructor or the no-arguments constructor, because
	 if we do not declare ANY constructor in our class, the java compiler generates and inserts in the .class file the default constructor  (i.e. the constructor without parameters)
	 */
	public BankAccount(){
	    // the default constructor initializes all the instance variables  with their default values
		// in our example, the default values are null for name,  and 0.0 for balance
	}
	
	// declare a setter method which allows to store a value into the instance variable named name
	public void setName(String name){
	    // store in the instance variable name (this.name) the value of the parameter name
		this.name = name;
	}
	
	// declare a setter method which allows to store a value into the instance variable named balance
	public void setBalance(double amount){
	    // store in the instance variable balance the value of the parameter amount
		this.balance = amount;	
	}
	
	// declare a getter method to return the value of the instance variable balance
	public double getBalance(){
		return balance;
	}
	
	
	// declare a check which will display the name of the bank account owner and the balance
	public void checkOwnerAndBalance(){
		System.out.println("BankAccount: owner: " + name + " balance: " + balance);
	}

	// declare a method to allow to deposit money into the bank account
	public void deposit(double amount){
	    // update the balance
		balance = balance + amount;
		// or, the following statement is equivalent with the above. note that you only need to use one of them and not both
		// this.balance = this.balance + amount;
	}	

	// declare a method to allow to withdraw money from the bank account
	public void withdraw(double amount){
	    // update the balance
		balance = balance - amount;
	}
	
	
} // ends the class



