/**
 *Theater1.java documantation
 *@author Dave Greene
 *31/10/2018
 */

public class Theater1 {

	// declare instance variables
	private String d;

	// set the value of d
	public void setD(String value){
		this.d = d;
	}

	// get the users entry and process the results
	public void getResult (String d){
		d = d.toLowerCase();
		// if its a weekday
		if(d.equals ("monday") || d.equals ("tuesday") || d.equals ("wednesday") || d.equals ("thursday")){
					 System.out.println("Admission price is 20 Euro on a " + d);
		 }else if(d.equals ("friday") || d.equals ("saturday") || d.equals ("sunday")){
					 System.out.println("Admission price is 30 Euro on a " + d);
		}else {
				System.out.println("That is not a valid entry");
			}
	}


}