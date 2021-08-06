package com.mark.objMasterOne;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public void attack(Human victim) {
		victim.health = victim.health - this.strength;
		System.out.println(victim + " lost " + this.strength + " and Health is now: " + victim.health);
	}
	
	
}

