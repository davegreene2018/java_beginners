/**
Calculate.java documantation
@Author Dave Greene
21-Oct-2018
*/

public class Calculate {
	// declare instance variables
	private int n1;
	private int n2;
	private int res;

	// create default constructor
	public Calculate(){

	}
	public Calculate (int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}

	public void multiply(){
		res = n1 * n2;
	}

	// set the value and stor in n1
	public void setNum1(int value){
		this.n1 = value;
	}
	// set the value in n2
	public void setNum2(int value){
		this.n2 = value;
	}

	// get method for num 1
	public int getNum1(){
		return n1;
	}
	// get result
	public int getResult(){
		return res;
	}

	// get method for n2
	public int getNum2(){
		return n2;
	}





}