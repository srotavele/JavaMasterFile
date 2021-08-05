package com.mark.objmasterone;


public class HumanTest {

	public static void main(String[] args) {
		Human dude1 = new Human("Karl");
		Human dude2 = new Human("Mitch");
		dude1.attack(dude2);
		dude1.getStats();
		dude2.getStats();
		
		Wizard wiz1 = new Wizard("Norma");
		Ninja nin1 = new Ninja("Dave");
		Samurai sam1 = new Samurai("Duke");
		Samurai sam2 = new Samurai("Shiela");
		
		wiz1.heal(dude1);
		wiz1.fireball(dude2);
		wiz1.getStats();
		
		nin1.steal(dude1);
		nin1.runAway();
		nin1.getStats();
		
		sam1.meditate();
		sam1.deathblow(dude2);
		sam1.howMany();
		sam1.getStats();
	}

}
