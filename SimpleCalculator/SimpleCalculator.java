/**
*SimpleCalculator Documantation
*@Author Dave Greene
*08-Oct-2018
*
*/

public class SimpleCalculator {

	// declare our variables
	private double d1;
	private double d2;
	private double resAdd;
	private double resSub;
	private double resMul;
	private double resDiv;

	// return our calculations for adding
	public double getResAdd(){
		return resAdd;
	}
	// return our calculations for subtracting
	public double getResSub(){
		return resSub;
	}
	// return our calculations for multipling
	public double getResMul(){
		return resMul;
	}
	// return our calculations for division
	public double getResDiv(){
		return resDiv;
	}
    // set the value for d1
	public void setD1(double value){
		d1 = value;
	}
	// set the value for d2
	public void setD2(double value){
		d2 = value;
	}
    // method for adding
	public void add(){
	resAdd = d1+d2;
	}
	// method for subtracting
	public void subtract(){
	resSub = d1-d2;
	}
	// method to multiply
	public void multiply(){
	resMul = d1*d2;
	}
	// method for division
	public void divide(){
	resDiv = d1/d2;
	}


}