package com.cg.service;

public class CurrencyServiceImpl implements ICurrencyService{

	private String msg;
	private double rate;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double convertToINR(double usd) {
		return rate*usd;
	}

	public String currentState() {
		return msg+" current rate id "+rate;
	}

}
