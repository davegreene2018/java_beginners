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

Invoice -- the instantiable class

@author HDCOMP students & adriana e chis

*/
public class Invoice{
	
	// declare instance variable/ data members
	private String partNo;
	private String partDesc;
	private double price;
	private int quantity;

	// declare a constructor with 4 parameters 
	// to initialize the instance variables with meaningful values
	// (otherwise the instance variables would be initialized with their default values)
	public Invoice(String partNo, String partDesc, double price, int quantity){
		
		// initialize the instance variable partNo (i.e. this.partNo) with the value of the parameter partNo
		this.partNo = partNo;
		// initialize the instance variable partDesc (i.e. this.partDesc) with the value of the parameter partDesc
		this.partDesc = partDesc;
		// initialize the instance variable price (i.e. this.price) with the value of the parameter price
		this.price = price;
		// initialize the instance variable quantity (i.e. this.quantity) with the value of the parameter quantity
		this.quantity = quantity;
	}

	/* declare setter methods -- one setter method for each of the instance variables a user can provide values for */
	
	// declare a setter method which allows to store a value into the instance variable named partDesc (i.e. this.partDesc)
	public void setPartDesc(String partDesc){
		 // store into the instance variable partDesc (i.e. this.partDesc) the value of the parameter partDesc
		this.partDesc = partDesc;
	}
	
	// declare a setter method which allows to store a value into the instance variable named quantity
	public void setQuantity(int quant){
		// store into the instance variable quantity the value of the parameter quant
		quantity = quant;
	}
	
	// declare a setter method which allows to store a value into the instance variable named partNo (i.e. this.partNo)
	public void setPartNo(String partNo){
		 // store into the instance variable partNo (i.e. this.partNo) the value of the parameter partNo
		this.partNo = partNo;
	}
	
	// declare a setter method which allows to store a value into the instance variable named price
	public void setPrice(double p){
		// store into the instance variable price the value of the parameter p
		price = p;
	}
	
	
	/* declare getter methods -- one getter method for each of the instance variables a user could retrieve/read */
	
    // declare a getter method to be able to retrieve the value of the instance variable partNo
	public String getPartNo(){
		return partNo;
	}

	// declare a getter method to be able to retrieve the value of the instance variable partDesc
	public String getPartDesc(){
		return partDesc;
	}

	// declare a getter method to be able to retrieve the value of the instance variable price
	public double getPrice(){
		return price;
	}

	// declare a getter method to be able to retrieve the value of the instance variable quantity
	public int getQuantity(){
		return quantity;
	}
	

	/* declare processing methods according to the specification/ requirements of the problem */
	
	// declare a method to calculate the invoice amount, and returns the calculated value
	public double getInvoiceAmount(){
		// declare a local variable of type double to store the invoice's total price
		double totalPrice;
		// the total price is given my multiplying the price per unit with the quantity
		totalPrice = price * quantity;		
		// return the value stored in the local variable totalPrice
		return totalPrice;
	} // ends getInvoiceAmount method

} // ends class
