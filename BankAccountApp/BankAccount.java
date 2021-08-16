/*
*BankAccountApp documantation
*@Author Dave Greene
*16-Oct-2018
*/

public class BankAccount{
	// declare variables
	private String name;
	private int account;
	private double balance;

	// default construct
	public BankAccount(){
	}

	public BankAccount (String name, int account, double amount){
		balance = amount;
		this.name = name;
	}
	// set values in name variales
	public void setName (String value){
		this.name = value;
	}
	// set values in account variales
	public void setAccount(int value){
		this.account = value;
	}
	// set values in balance variales
	public void setBalance(double value){
		this.balance = value;
	}

	// get values name
	public String getName(){
		return name;
	}
	// get values account
	public int getAccount(){
		return account;
	}
	// values balance
	public double getBalance(){
		return balance;
	}
	// calculate balance after deposit
	public void depositMoney(double amount){
		balance = balance + amount;
	}

	// calculate balance after withdraw
	public void withdrawMoney(double amount){
		balance = balance - amount;
	}


}