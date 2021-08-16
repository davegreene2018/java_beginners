/** */

public class Pay {

	private String resultNormal;
	private String resultOverTime;
	private double payMe;
	private double payOverTime;
	private double totalPay;
	private double basicPayPerHour;

	// process to calculate normal hours
	public void normalHoursCalc (double hours){
		payMe = hours * 1;
		resultNormal = ("Your basic pay is " + payMe);
		}

	// process over time
	public void overTimeCalc (double overTime){
		 payOverTime = overTime * 1;
		 resultOverTime = ("Your overtime pay is " + payOverTime);
		}

	// display normal
	public void displayNormal(){
		System.out.println(resultNormal);
		}
	// display overtime
	public void displayOverTime(){
		System.out.println("over time" + resultOverTime);
	}

	// display all
	public void displayAll(){
		totalPay = payMe + payOverTime;
	System.out.println("Your total pay including overtime is " + totalPay);
	}

}

































