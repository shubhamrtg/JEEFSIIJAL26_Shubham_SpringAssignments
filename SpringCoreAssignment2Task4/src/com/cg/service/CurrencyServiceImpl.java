package com.cg.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySer")
public class CurrencyServiceImpl implements ICurrencyService{

	@Value("${state}")
	private String msg;
	@Value("${crate}")
	private double rate;

	@Override
	public double convertToINR(double usd) {
		return rate*usd;
	}

	@Override
	public String currentState() {
		return msg+" current rate id "+rate;
	}

}
