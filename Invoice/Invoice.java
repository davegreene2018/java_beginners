

public class Invoice {
	// declare instance variables/ data members
	private String partNo;
	private String partDesc;
	private double price;
	private int quantity;

	public void setPartDesc(String partDesc){
		partDesc = partDesc;
	}
	public void setQuantity(int quant){
		quantity = quant;
	}

	public String getPartNo(){
		return partNo;
	}
	public String getPartDesc(){
		return partDesc;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}

	// declare a constructor to initialize

	public Invoice (String partNo, String partDesc, double price, int quantity){
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.price = price;
		this.quantity = quantity;

	}

	public double getInvoiceAmount(){
		double totalPrice;
		totalPrice = price * quantity;
		return totalPrice;


	}



}