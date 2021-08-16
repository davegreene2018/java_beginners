/*
*PersonApp.java documantation
*@Author Dave Greene
*15-Oct-2018
*/

public class PersonApp {

	public static void main(String args[]){
		// declare variable of data type Person
		Person p1;
		// create the object of type person
		p1 = new Person();

		// invoke/call object
		p1.displayState();

		Person p2;
		String n ="John";
		int a = 40;
		boolean reads = true;
		p2 = new Person (n, a, reads);
		p2.displayState();

		Person p3;
		n = "Dave";
	    reads = true;
		p3 = new Person (n, reads);
		p3.displayState();

		Person p4;
		n = "Peter";
		p4 = new Person(n);
		p4.displayState();


	}



}

