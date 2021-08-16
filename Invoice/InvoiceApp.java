/*
* Invoice.java documantation
* @Author Dave Greene
* 15-Oct-2018
*/
import java.util.Scanner;

public class InvoiceApp {
// declare main method
	public static void main(String args[]){
	// declare a variable of type Scanner
	Scanner input;
	// Declare an object of type Scanner
	input = new Scanner(System.in);

	String pNo;
	String pDesc;
	double p;
	int q;
	// declare a variable of invoice
	Invoice myInvoice;


	// Get data from the user
	System.out.println("Please enter part number");
	pNo = input.nextLine();
	System.out.println("Please enter description");
	pDesc = input.nextLine();
	System.out.println("Please enter price");
	p = input.nextDouble();
	System.out.println("Please enter quantity");
	q = input.nextInt();

	myInvoice = new Invoice(pNo, pDesc, p, q);

	String myPartNo;
	myPartNo = myInvoice.getPartNo();
	System.out.println("Invoice details: ");
	System.out.println("Part No: " + myPartNo);

    String myPartDesc;
	myPartDesc = myInvoice.getPartDesc();
	System.out.println("Part Desc: " + myPartDesc);

	double myPartPrice;
	myPartPrice = myInvoice.getPrice();
	System.out.println("Price: " + myPartPrice);

	int myPartQuantity;
	myPartQuantity = myInvoice.getQuantity();
    System.out.println("Quantity: " + myPartQuantity);
    double totalPrice;
    totalPrice = myInvoice.getInvoiceAmount();
    System.out.println("Total amount: " + totalPrice);


	}


}