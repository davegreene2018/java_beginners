/*
*BankAccountApp documantation
*@Author Dave Greene
*16-Oct-2018
*/

public class Sphere {

	// declare variables
	private double radius;
	private final double P = 3.14;

	// default constructor
	public Sphere(){

	}
	public Sphere(double value, final double P){
		this.radius = value;

	}
	// set the value of radius
	public void setRadius (double value){
		this.radius = value;
	}


	// calculate the volume
	public double volume(double radius){
		radius = 4/3 * (P * radius * radius * radius);
		return radius;

	}

	// return the value of radius
		public double getRadius(){
			return radius;
	}

}