/******************
* Pay documantation
* @uthor Dave Greene
* 04-Oct-2018
*******************/

public class Pay {
    // declare our variables
	private double resultBasic;
	private double resultHours;
	private double resultOvertime;
    private final double OVERTIME_PAY = 1.5;
	// get the basic variable and save in resultBasic
	public void setBasic (double value){
		resultBasic = value;
	}
	// get the normalHours variable asnd save in resultHours
	public void setHours(double value){
		resultHours = value;
	}

	// get the overtime variable and save it in resultOvertime
	public void setOvertime(double value){
		resultOvertime = value;
	}
	// display the basic result
		public void displayResults(){
			System.out.println("Your basic pay is " + resultBasic * resultHours);
			System.out.println("Your over time pay is " + resultBasic * resultOvertime * OVERTIME_PAY);
			System.out.println("Your total pay including overtime is " + (resultBasic * resultHours + resultBasic * resultOvertime * 1.5));

}
}