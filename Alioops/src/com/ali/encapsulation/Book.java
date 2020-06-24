package com.ali.encapsulation;

public class Book {
	private int noOfCopies;
	void setnoOfCopies(int noOfCopies) {
		if(noOfCopies>0) 
		this.noOfCopies=noOfCopies;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	void increasenoOfCopies(int howMuch) {
		setnoOfCopies(this.noOfCopies+howMuch);
		
	}
	void decresenoOfCopies(int howMuch) {
		setnoOfCopies(this.noOfCopies-howMuch);
		
		
	}
	
}
