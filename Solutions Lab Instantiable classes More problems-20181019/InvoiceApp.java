/** 
Lab5: Instantiable Classes - More Problems

Problem 1
Create a class called Invoice that a hardware store might use to represent an
invoice for an item sold at the store. An Invoice should include four pieces
of information as instance variables ?a part number (data type String), a
part description (data type String), a quantity of the item being purchased
(data type int) and a price per item (data type double). Your class should
have a constructor that initializes the four instance variables. Provide a set
and a get method for each instance variable. In addition, provide a method
named getInvoiceAmount that calculates the invoice amount (i.e., multiplies
the quantity by the price per item), then returns the amount as a double
value. Write a test application named InvoiceApp that demonstrates the
instantiable class Invoice's capabilities. (Deitel & Deitel, 2014).

InvoiceApp 
	-- takes input from the user
	-- uses the Invoice -- the instantiable class to perform the actual computations
	

@author HDCOMP students & adriana e chis

*/


import java.util.Scanner;

public class InvoiceApp{
	public static void main(String args[]){

		// declare variables of type Scanner
		Scanner banana, apple;
		// create an object of type Scanner
		banana = new Scanner(System.in);
		// create another object of type Scanner
		apple = new Scanner(System.in);

		
		// declare variables that will be used to store the information provided by the user
		String pNo, pDesc;
		int q;
		double p;

		// declare a variable of type Invoice
		Invoice myInvoice;
		/* recall that in the Invoice instantiable class we have declared one constructor that requires 4 pieces of information/data, 
			therefore at this point we cannot create an Invoice object yet */
		
		// input
		// prompt the user for data
		System.out.println("enter part number");
		pNo = banana.next(); // reads one single word


		System.out.println("enter description");
		pDesc = apple.nextLine(); // reads an entire line

		System.out.println("enter price");
		p = banana.nextDouble(); // read one double value

		System.out.println("enter quantity");
		q = banana.nextInt(); // reads one integer value

		
		// create an object of type Invoice using the constructor with 4 parameters
        /*
         in this case, during the program execution Java will
         create and save in memory an object with its instance variables initialized as follows:
             -- partNo is initialized with the value of pNo
             -- partDesc is initialized with the value of pDesc
			 -- price is initialized with the value of p
			 -- quantity is initialized with the value of q
        */
		myInvoice = new Invoice(pNo, pDesc, p, q);
		
		/* ==== TASK: display the details of the invoice */
		
		// use the getter to retrieve the details of the invoice	
		System.out.println("Invoice details: ");
		
		String myPartNo;
		// call/invoke the getter method getPartNo() to retrieve the value of partNo, and then store the value in the variable myPartNo
		myPartNo = myInvoice.getPartNo();
		// display the value of myPartNo variable
		System.out.println("Part No: " + myPartNo);

		// call/invoke the getter method getPartDesc() to retrieve the value of partDesc, and then store the value in the variable myPartDesc
		String myPartDescr = myInvoice.getPartDesc();
		// display the value of myPartDesc variable
		System.out.println("Description: " + myPartDescr);

		// call/invoke the getter method getPrice() to retrieve the value of price, and then store the value in the variable myPrice
		double myPrice = myInvoice.getPrice();
		// display the value of myPrice variable
		System.out.println("Price: " + myPrice);

		// call/invoke the getter method getQuantity() to retrieve the value of quantity, and then store the value in the variable myQuantity
		int myQuantity = myInvoice.getQuantity();
		// display the value of myQuantity variable
		System.out.println("Quantity: " + myQuantity);
		System.out.println();
		
		
		
		/* ==== TASK: allow a user to update some details of the invoice */
		
		// Let's assume the user has entered some wrong data, let's allow him/her to update the description and then the quantity of the *existing* invoice
		System.out.println("enter updated description");
		myPartDescr = apple.nextLine(); // reads an entire line
		// call/invoke the setter method to set/update the value of the object's instance variable called partDesc with the value provided via the keyboard
		myInvoice.setPartDesc(myPartDescr);

		
		System.out.println("enter updated quantity");
		myQuantity = banana.nextInt(); // reads one integer value
		// call/invoke the setter method to set/update the value of the object's instance variable called quantity with the value provided via the keyboard
		myInvoice.setQuantity(myQuantity);
		
		// let's display again the updated details of the invoice
		// call/invoke the getter method getPartDesc() to retrieve the value of partDesc, and then store the value in the variable myPartDesc
		myPartDescr = myInvoice.getPartDesc();
		// display the value of myPartDesc variable
		System.out.println("Updated description: " + myPartDescr);
		
		// call/invoke the getter method getQuantity() to retrieve the value of quantity, and then store the value in the variable myQuantity
		myQuantity = myInvoice.getQuantity();
		// display the value of myQuantity variable
		System.out.println("Updated quantity: " + myQuantity);

		/* ==== TASK: calculate the total price of the invoice */
		// processing
		// call/invoke the method getInvoiceAmount() which calculates *and* returns the invoice's total price, and store the value in the variable myTotalPrice
		double myTotalPrice = myInvoice.getInvoiceAmount();

		// output
		// display the value of myTotalPrice variable
		System.out.println("Total Price: " + myTotalPrice);

	}
}

