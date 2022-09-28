package com.ishaq.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maxium;
private 	int minimum;

protected LimitConfiguration() {
	
}
	public LimitConfiguration(int maxium, int minimum) {
		super();
		this.maxium = maxium;
		this.minimum = minimum;
	}
	public int getMaxium() {
		return maxium;
	}
	public int getMinimum() {
		return minimum;
	}

}
