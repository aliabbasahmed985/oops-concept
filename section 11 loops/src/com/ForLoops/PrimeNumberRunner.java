package com.ForLoops;

public class PrimeNumberRunner {

	public static void main(String[] args) {
		PrimeNumber primenumber=new PrimeNumber(15);
		boolean prime = primenumber.prime();
		System.out.println("is prime - "+prime);
		
		int sum=primenumber.sumUptoN();
		System.out.println("sum="+sum);

	}

}
