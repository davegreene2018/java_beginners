/**
 *GuessNumber.java documantation
 *@author Dave Greene
 *31/10/2018
 */

 public class GuessNumber {

	 // declare variables
	 int n;
	 int r;

	 // create default constructor
	 public void GuessNumber (){

	 }
	 // set the value of n
	 public void setNumber (int value){
		 this.n = value;
	 }
	 // set the value of r
	 public void setRandom(int value){
		 this.r = value;
	 }

	 // compute the values of the numbers to let the user know if to high or low
	 public void checkNumber (){
		 if(n==r){
			  System.out.println("");
			 System.out.println("You win the secret number was " + r);
		 }else if(n>r){
			 System.out.println("Too high the secret number was " + r);
		 }else {
			 System.out.println("Too low the secret number was " + r);
		 }
	 }

	 // display results
	 public void displayMe (){
		 System.out.println("");
		System.out.println("You entered " + n + " the random number was " + r);
	 }



 }