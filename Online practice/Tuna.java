/**
 *Tuna.java
 *@Author Dave Greene
 *29/10/2018
 */

 public class Tuna {
	 public String girlName;
	 // constructor tuna
	 public Tuna (String name){
		this.girlName = name;
	 }

	 public void setName(String name){
		this.girlName = name;
	 }

	 public String getName(){
		 return girlName;
	 }

	 public void saying(){
		 System.out.println("Your first girlfriends name was " + girlName);
	 }


 }// close class