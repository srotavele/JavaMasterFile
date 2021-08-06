package com.mark.zk2;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("Flappity flap flap");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("A wilhelm scream - crunch, crunch");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown( ) {
		System.out.println("Crackle, boom, sizzle");
		this.energyLevel -= 100;
		return this;
	}
}
