package com.mark.zkOne;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	public int displayEnergy() {
		System.out.println("Energy level is: " + this.energyLevel);
		return this.energyLevel;
	}
}
