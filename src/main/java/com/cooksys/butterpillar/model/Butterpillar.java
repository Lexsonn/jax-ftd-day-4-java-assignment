package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	private double length;
	private double leavesEaten;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}
	
	public boolean equals(Butterpillar b) {
		return ((this.length == b.length) && (this.leavesEaten == b.leavesEaten));
	}
	
	@Override
	public String toString() {
		return "Butterpillar length: " + length + ", leaves eaten: " + leavesEaten;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
