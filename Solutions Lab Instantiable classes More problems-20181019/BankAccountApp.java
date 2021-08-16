/** 
Lab5: Instantiable Classes - More Problems

Problem 2
Develop an application which consists of two classes, the instantiable class
BankAccount and the application class BankAccountApp.
	- TheBankAccount instantiable class should would represent any bank account that we can open at a bank.
	- The BankAccountApp class contains the main method and will create objects of type BankAccount to demonstrate the capabilities of the BankAccount.
	
Hint: To develop the instantiable class, first, think about the properties/attributes of a bank account. Next, think what are the operations that can be performed on a bank account?

@author a e chis

BankAccountApp.java demonstrates 
	-- how to reuse the instantiable class BankAccount
	    --- how to create several objects/instances of typeBankAccount
		--- how to use the constructors to initialize an object's attributes/ properties/ state
	    --- how to call/invoke an object's method (e.g. checkOwnerAndBalance) to perform its tasks	
	

*/

import java.util.Scanner;

// declare the class named BankAccountApp
public class BankAccountApp {

    // declare the main method
	public static void main(String args[]){
    
        // declare a variable named input of type Scanner, and create an object of type Scanner
		Scanner input = new Scanner(System.in);

        // declare variables
		String n; // to store the name
		double b; // to store the balance

		// prompt user for input
		System.out.println("enter name: ");
		n = input.nextLine(); // read an entire line
		System.out.println("initial balance:");
		b = input.nextDouble(); // read a double number


		
/* ===== EXAMPLE 1: Use the constructor without parameters to create an object of type BankAccount */
/* TASK: Use the constructor without parameters to create an object of type BankAccount */
        		
		// declare a variable named account1 of type BankAccount
		BankAccount account1;
		// create an object/instance of type BankAccount using the constructor without parameters
		account1 = new BankAccount();
		// call/invoke the method checkOwnerAndBalance() to display the values of the object's instance variables. 
		/* Note that because we created the object above using the constructor without parameters 
			the instance variables are initialized with their default values (i.e. null and 0.0). 
			This are not meaningful values as we would like the instance variables to have the values provided by the user
		*/
		account1.checkOwnerAndBalance();
	
	
/* TASK: use setters to store meaningful data into the account */
		// use the setter method setName() to set/assign the name n provided by the user into the account's name
		account1.setName(n);
		// use the setter method setBalance() to set/assign the balance b provided by the user into the account's balance
		account1.setBalance(b);
		// call/invoke the method checkOwnerAndBalance() to display the values of the object's instance variables. 
		/* Note that now the values of the instance variables contains the values provided by the user. */
		account1.checkOwnerAndBalance();
	
	
/* TASK: deposit money into the account */
		// prompt user for data
		System.out.println("how much do you want to deposit?");
		b = input.nextDouble();
		
		
		// processing
		// call the method deposit() on the object account1 to deposit the amount b into the account
		account1.deposit(b);
		
		// output
		// call the getter method getBalance() on the object account1 to retrieve the new balance, and store the result in variable newB
		double newB = account1.getBalance();
		// display the new balance
		System.out.println("current balance: " + newB);

		
/* TASK: withdraw money from the account */
		// prompt user for data
		System.out.println("how much do you want to withdraw?");
		b = input.nextDouble();
		
		
		// processing
		// call the method withdraw() on the object account1 to withdraw the amount b from the account
		account1.withdraw(b);
		
		// output
		// call the getter method getBalance() on the object account1 to retrieve the new balance, and store the result in variable newB
		newB = account1.getBalance();
		// display the new balance
		System.out.println("current balance: " + newB);
	


	
		
/* ===== EXAMPLE 2: Use the constructor with  parameters to create an object of type BankAccount */
		
        // declare a variable named input2 of type Scanner, and create an object of type Scanner
		Scanner input2 = new Scanner(System.in);
		
		
/* TASK: Use the constructor with  parameters to create an object of type BankAccount */	
		// prompt user for input
		System.out.println("enter name:");
		n = input2.nextLine(); // read an entire line
		System.out.println("enter initial balance");
		b = input2.nextDouble(); // read a double number
		
		// declare a variable named account2 of type BankAccount
		BankAccount account2;
		// create an object/instance of type BankAccount using the constructor with 2 parameters
		account2 = new BankAccount(b, n);
		// call/invoke the method checkOwnerAndBalance() to display the values of the object's instance variables. 
		/* Note that because we created the object above using the constructor with 2 parameters 
			the instance variables are initialized with the values provided to the constructor, 
			in this case, balance is initialized with the value stored in b, and name is initialized with the value stored in n.
		*/
		account2.checkOwnerAndBalance();

		
/* TASK: use setter to update the name of the account*/		
		// further, we can use any of the methods available in the intantiable class BankAccount
		// for example, we can use the setter method setName() if we would like to update the name
		account2.setName("Emma Smith");
		account2.checkOwnerAndBalance();
		// let's update again the name of the bank account
		// call/invoke the setter method setName() to update again the name of the second bank account
		account2.setName("John and Emma Murphy");
		account2.checkOwnerAndBalance();
	
	
	} // ends the main method
	
} // ends the class


