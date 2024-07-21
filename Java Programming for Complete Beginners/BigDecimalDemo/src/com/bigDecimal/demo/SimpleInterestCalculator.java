package com.bigDecimal.demo;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal, interest;

	SimpleInterestCalculator() {

	}

	SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal simpleInterest = principal.multiply(interest).multiply(new BigDecimal(noOfYears));
		return principal.add(simpleInterest);
	}
}
