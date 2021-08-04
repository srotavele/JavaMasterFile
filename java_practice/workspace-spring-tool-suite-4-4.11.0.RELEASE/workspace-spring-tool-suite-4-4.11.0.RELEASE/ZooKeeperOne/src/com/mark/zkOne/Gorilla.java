package com.mark.zkOne;

public class Gorilla extends Mammal {
		public Gorilla throwSomething() {
			System.out.println("Magilla threw something. Bad Magilla");
			this.energyLevel -= 5;
			return this;
		}
		public Gorilla eatBananas() {
			System.out.println("Magilla happy cuz bananas");
			this.energyLevel += 10;
			return this;
		}
		public Gorilla climb() {
			System.out.println("Magilla climbed up a hugetree.");
			this.energyLevel -= 10;
			return this;
		}
}
