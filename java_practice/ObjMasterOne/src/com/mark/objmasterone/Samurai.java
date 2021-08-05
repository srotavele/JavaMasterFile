package com.mark.objmasterone;

public class Samurai extends Human {
	static int numSams = 0;

	public Samurai(String name) {
		super(name);
		this.setName(name);
		this.setHealth(200);
		numSams ++;
	}
	public void deathblow(Human victim) {
		victim.setHealth(0);
		this.setHealth(this.getHealth() /2);
		System.out.println(victim.getName() + " has been removed from the flow of life");
		System.out.println("however, this unnatural act has cost the Samurai dearly and Health is now: " + this.getHealth());
	}
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth() /2);
		System.out.println("After meditating, our Samurai's Health is now: " + this.getHealth());
	}
	public void howMany() {
		System.out.println("Currently there are " + numSams + " Samurai in your neighborhood");
	}

}
