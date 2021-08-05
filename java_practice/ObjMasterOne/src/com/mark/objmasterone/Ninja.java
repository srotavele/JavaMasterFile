package com.mark.objmasterone;

public class Ninja extends Human {

	public Ninja(String name) {
		super(name);
		this.setStealth(10);
		this.setName(name);
	}
	public void steal(Human victim) {
		victim.setHealth(victim.getHealth()  - this.getStealth());
		this.setHealth(getHealth() + this.getStealth());
		System.out.println(victim.getName() + " was robbed by a Ninja and Health is now " + victim.getHealth());
		System.out.println("However, the stealthy Ninja's health is now " + this.getHealth());
		
	}
	public void runAway() {
		this.setHealth(getHealth() - 10);
		System.out.println("Ninjas don't run away from a fight. Your Health is now " + this.getHealth());
	}

}
