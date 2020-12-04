package pokemon;

//Create an abstract class that only implements createPokemon and pokemonInfo(Pokemon pokemon) from the PokemonInterface.

public abstract class AbstractPokemon {
	//these are from the interface
	//This method creates and returns Pokemon.
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		
		return newPokemon;
	}
	//This method returns a String with the name, health, and type of the pokemon.
	public abstract String pokemonInfo(Pokemon pokemon);
	
}
