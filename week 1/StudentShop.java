/** Student union shop documantation*/

import java.util.Scanner;

public class StudentShop {

	// main method
	public static void main(String args[]){

		double caps = 5.00;
		double shirts = 10.00;
		double hoodies = 20.00;
		double totalCost;

		Scanner input;
		// welcome message
		System.out.println("Welcome to our student union shop");
		System.out.println("");
		System.out.println("We have the following items to sell");
		System.out.println("");
		System.out.println("Caps " + caps + " Euros");
		System.out.println("Shirts " + shirts + " Euros");
		System.out.println("Hoodies " + hoodies + " Euros");
		// gather caps data
		System.out.println("");
		input = new Scanner(System.in);
		System.out.println("Please enter how many caps you would like to buy");
		caps = input.nextDouble();
		// gather shirts data
		System.out.println("");
		input = new Scanner(System.in);
		System.out.println("Please enter how many shirts you would like to buy");
		shirts = input.nextDouble();
		// gather hoodies data
		System.out.println("");
		input = new Scanner(System.in);
		System.out.println("Please enter how many hoodies you would like to buy");
		hoodies = input.nextDouble();
		// Process the total cost of the cart
		totalCost = caps * 5.00 + shirts * 10.00 + hoodies * 20.00;
		// display the contents of the cart and total cost
		System.out.println("");
		System.out.println("Your cart is Caps x " + (int)caps + " , Shirts x " + (int)shirts + " and Hoodies x " + (int)hoodies);
		System.out.println("");
		System.out.println("Total cost is " + totalCost + " Euros");
		System.out.println("");
		System.out.println("Thank you for shopping at our student union shop :)");
		System.out.println("");


	}// end main method

}// end class