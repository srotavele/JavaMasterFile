package com.mark.zkOne;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla bigG = new Gorilla();
		
		bigG.throwSomething().displayEnergy();
		bigG.throwSomething().displayEnergy();
		bigG.throwSomething().displayEnergy();
		bigG.eatBananas().displayEnergy();
		bigG.eatBananas().displayEnergy();
		bigG.climb().displayEnergy();
	}

}
