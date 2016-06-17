package com.cooksys.butterpillar.model;

public class GrowthModel {

	private double lengthToWingspan;
	private double leavesEatenToWeight;

	public double getLengthToWingspan() {
		return lengthToWingspan;
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight;
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		Catterfly c = new Catterfly();
		c.setWingspan(butterpillar.getLength()*lengthToWingspan);
		c.setWeight(butterpillar.getLeavesEaten()*leavesEatenToWeight);
		return c;
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		Butterpillar b = new Butterpillar();
		b.setLength(catterfly.getWingspan()/lengthToWingspan);
		b.setLeavesEaten(catterfly.getWeight()/leavesEatenToWeight);
		return b;
	}
	
	public boolean equals(GrowthModel g) {
		return ((this.leavesEatenToWeight == g.leavesEatenToWeight) && (this.lengthToWingspan == g.lengthToWingspan));
	}
	
	@Override
	public String toString() {
		return "Growthstat length ratio: " + lengthToWingspan + ", weight ratio: " + leavesEatenToWeight;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
