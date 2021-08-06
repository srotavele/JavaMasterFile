package com.mark.zk2;

public class BatTest {

	public static void main(String[] args) {
		Bat bigB = new Bat();
		
		bigB.attackTown().displayEnergy();
		bigB.attackTown().displayEnergy();
		bigB.attackTown().displayEnergy();
		bigB.eatHumans().displayEnergy();
		bigB.eatHumans().displayEnergy();
		bigB.fly().displayEnergy();
		bigB.fly().displayEnergy();

	}

}
