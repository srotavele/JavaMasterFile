package com.mark.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex newPoke = new Pokedex(); 

		Pokemon pikachu = newPoke.createPokemon("Pikachu", 100, "turtle");
		Pokemon treeko = newPoke.createPokemon("Treeko", 100, "Green thing");
		newPoke.addPoke(pikachu);
		newPoke.addPoke(treeko);
		newPoke.listPokemon();
		pikachu.attackPokemon(treeko);
		newPoke.listPokemon();
		System.out.println(Pokemon.pokeCount());  

	}

}
