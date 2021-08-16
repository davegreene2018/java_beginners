/*
*Person.java documantation
*@Author Dave Greene
*15-Oct-2018
*/

public class Person {
	// declare variables
	private String name;
	private int age;
	private boolean enjoysReading;

	// Create Constructor with no arguments
	public Person (){

	}

	// Create constructor with 3 arguments
	public Person (String aName, int anAge, boolean eR){
		name = aName;
		age = anAge;
		enjoysReading = eR;

	}

	// create construct with name and enjoys reading
	public Person (String name, boolean enjoysReading){
		this.name = name;
		this.enjoysReading = enjoysReading;

	}

	// constructor with only the name
	public Person (String name){
		this.name = name;

	}

	// declare method
	public void displayState(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(enjoysReading);
		System.out.println();

	}


}