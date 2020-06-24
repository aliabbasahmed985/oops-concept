package com.IntDataType;

public class BiNumber {

	private int number1;
	private int number2;
	private int number3;
	
	public BiNumber(int number1, int number2, int number3) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	public int add() {
		return number1+number2+number3;
	}
	public int multiply() {
		return number1*number2*number3;
	}
	public void doubleValue() {
		this.number1*=2;
		this.number2*=2;
		this.number3*=2;
		
	}
}
