package com.mark.objmasterone;

public class Wizard extends Human {
	

	public Wizard(String name) {
		super(name);
		this.setName(name);
		this.setHealth(50);
		this.setIntelligence(8);	
	}
	public void heal(Human victim) {
		victim.setHealth(victim.getHealth()  + this.getIntelligence());
		System.out.println(victim.getName() +  " was healed by a Wizard and Health is now " + victim.getHealth());
		
		
	}
	public void fireball(Human victim) {
		victim.setHealth(victim.getHealth() - this.getIntelligence() *3);
		System.out.println(victim.getName() + " was smashed by a fireball and now Health is " + victim.getHealth());
	}
		 
}
