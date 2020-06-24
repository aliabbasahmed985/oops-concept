package com.Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Person person =new Person();
		person.setName("abbas");
		person.setEmail("ali@gmail.com");
		person.setPhone(872);
		String value =person.toString ();
		System.out.println(value);
		System.out.println(person);
		
	}

}
