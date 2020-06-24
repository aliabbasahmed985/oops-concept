package com.BigDecimal;

import java.math.BigDecimal;

public class SimpleIntrestRunner {

	public static void main(String[] args) {
		SimpleIntrestCalculator calculator=new SimpleIntrestCalculator("9300.00","9.5");
		BigDecimal totalValue=calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
