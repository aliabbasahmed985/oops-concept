package com.BigDecimal;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	BigDecimal principle;
	BigDecimal intrest;
	public SimpleIntrestCalculator(String principle, String intrest) {
		super();
		this.principle = new BigDecimal(principle);
		this.intrest =new BigDecimal( intrest);
	}
	public BigDecimal getPrinciple() {
		return principle;
	}
	public void setPrinciple(BigDecimal principle) {
		this.principle = principle;
	}
	public BigDecimal getIntrest() {
		return intrest;
	}
	public void setIntrest(BigDecimal intrest) {
		this.intrest = intrest;
		
	}
	public BigDecimal calculateTotalValue(int numberOfYears) {
		BigDecimal totalValue=principle.add(principle).multiply(intrest).multiply(new BigDecimal(numberOfYears));
		
		return totalValue;
	}
	

}
