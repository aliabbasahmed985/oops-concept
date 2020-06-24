package com.ali.encapsulation;

public class BookRunner {

	public static void main(String[] args) {
		Book harryPotter=new Book();
		Book vampireDiaries=new Book();
		
		harryPotter.setnoOfCopies(10);
		vampireDiaries.setnoOfCopies(5);
		
		harryPotter.increasenoOfCopies(100);
		vampireDiaries.increasenoOfCopies(200);
		
		harryPotter.decresenoOfCopies(100);
		vampireDiaries.decresenoOfCopies(200);
		
		
		System.out.println(harryPotter.getNoOfCopies());
		System.out.println(vampireDiaries.getNoOfCopies());

	}

}
