package pokemon;

import java.util.ArrayList;

//Create an abstract class that only implements createPokemon and pokemonInfo(Pokemon pokemon) from the PokemonInterface.

public abstract class AbstractPokemon {
	//create a list to store all new pokemons
	protected static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	//these are from the interface
	//This method creates and returns Pokemon.
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		
		myPokemons.add(newPokemon);
		
		return newPokemon;
	}
	//This method returns a String with the name, health, and type of the pokemon.
	public abstract String pokemonInfo(Pokemon pokemon);
	
}
