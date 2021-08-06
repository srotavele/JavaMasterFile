package com.mark.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon { 
	
		//	Create list of Pokemon to iterate through
		private ArrayList<Pokemon> myPoke = new ArrayList<Pokemon>();
		
		public void addPoke(Pokemon pokemon){
			myPoke.add(pokemon);
		}

		public void listPokemon() {
			//Looping through array 
			for (Pokemon pokemon : myPoke) {
				System.out.println(pokemonInfo(pokemon));
			}
		
	}

	

}
