package com.compositionOops;

public class BookRunner {

	public static void main(String[] args) {
		Book book =new Book(456,"salmaan ki jawani","abbas");
		book.addReview(new Review(10,"gandu madarchod",5));
		book.addReview(new Review(5,"chutiya bhenkada ",2));
System.out.println( book);
	}

}
