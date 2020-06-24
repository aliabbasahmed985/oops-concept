package com.WhileLoop;

public class WhileLoopClass {
	private int limit;

	public WhileLoopClass(int limit) {
		super();
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
     int i=1;
while(i*i<limit) {
	System.out.print(i*i+" ");
	i++;
	
}
System.out.println();
	}

	public void printCubesUptoLimit() {
		     int i=1;
		while(i*i*i<limit) {
			System.out.print(i*i*i+" ");
			i++;
		}
		System.out.println();	
	}
	

}
