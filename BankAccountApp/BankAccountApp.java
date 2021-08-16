/*
*BankAccountApp documantation
*@Author Dave Greene
*16-Oct-2018
*/
import java.util.Scanner;
public class BankAccountApp {
	// declare main method

	public static void main(String args[]){

		// declare variable of type Scanner
		Scanner input = new Scanner(System.in);

		// declare variables
		String n; // to store the name
		double b; // to store the balance
		int a; // to store account number

		// declare variable of type BankAccount
		BankAccount myDetails = new BankAccount();

		// prompt the user to enter their name
		System.out.println("Enter your name:");
		n = input.nextLine();
		myDetails.setName(n);
		// prompt the user to enter bank account number
		System.out.println("enter your account number:");
		a = input.nextInt();
		myDetails.setAccount(a);
		// prompt the user to enter balance
		System.out.println("Enter your balance:");
		b = input.nextDouble();
		myDetails.setBalance(b);
		// display the user name and balance
		System.out.println(n + " your balance is " + b);
		// promp the user to deposit money
		System.out.println("Enter how much you want to deposit");
		b = input.nextDouble();
		myDetails.depositMoney(b);
		// declare new variable for updated balance
		double newB = myDetails.getBalance();
		// give the user new balance after deposit
		System.out.println(n + " new balance is " + newB);
		// promp the user to make a withdraw
		System.out.println("Enter how much you want to withdraw");
		b = input.nextDouble();
		myDetails.withdrawMoney(b);
		newB = myDetails.getBalance();
		// display the new balance to the user
		System.out.println(n + " new balance is " + newB);




	}

}