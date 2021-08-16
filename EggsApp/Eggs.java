/** Documantation for reusable class @author Dave Greene 2018*/

public class Eggs {
	// declare variables
	String result;
	int totalBoxesNeeded;
	int remainder;

	// method
	public void boxs (int eggs){
		// process how many boxes are needed
		totalBoxesNeeded = eggs / 12;
		remainder = eggs % 12;
		result = ("Joe you will need " + totalBoxesNeeded +" boxes and will have " + remainder + " left over");
	}
	// display the result
	public void displayMe (){
	System.out.println(result);
	}

}