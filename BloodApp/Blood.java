/**
 *BloodApp.java documantation
 *@author Dave Greene
 *31/10/2018
 */


 public class Blood {

	 //create a default constructor
     public Blood (){
	 }
	 // create variables to store blood group
	 private String b;
	 private int a;
	 private String result;

	// set the age
	public void setAge(int value){
		this.a = value;
	}
	// get the age
	public int getAge (int value){
		return a;
	}


	 // check to see if the user is old enough to donate blood
	 public void isOldEnough(int number){
		 a = number;
		if(a < 18){
			 System.out.println("Sorry not old enough, Come back when your 18");
		 }else {
			 System.out.println("Congratulatins you are old enough to donate blood :)");
		 }
	 }

	 // store the value in type of blood
	 public void setBlood(String value){
		 this.b = value;
	 }

	 // get blood type
	 public String getBlood(String value){
		return b;
	 }

     // check blood
     public void checkBlood(){
		 if (b.equals ("ab")){
			result = b;
			System.out.println("You can give to AB you can recieve from AB, A, B, and O");
		 }else if(b.equals("a")){
			 result = b;
			 System.out.println("You can give to A and AB you can recieve from A and O");
		}else if(b.equals("b")){
			result = b;
			 System.out.println("You can give to B and AB you can recieve from B and O");
		}else if(b.equals("o")){
			 System.out.println("You can give to A, B, AB, and O you can recieve from O");
		}else{
			 System.out.println("You have not entered a valid blood type");
		}
	 }
	 // display results
	 public void displayMe(){
		 System.out.println(result);
	 }





 }