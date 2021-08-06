package com.mark.objmasterone;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void attack(Human victim) {
		victim.health = victim.health - this.strength;
		System.out.println(victim.getName() + " lost " + this.strength + " and Health is now: " + victim.getHealth());
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public void getStats() {
		System.out.println(this.getName() + " Strength: " + this.getStrength() + " Stealth: " + this.getStealth() + " Intelligence: " + this.getIntelligence() + " Health: " + this.getHealth());
	}
	
	
}

