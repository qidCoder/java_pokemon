package pokemon;

//Create a Pokedex class that extends the abstract class and implements listPokemon(). Your Pokedex class needs an attribute called myPokemons where you store all the pokemons created.
public class Pokedex extends AbstractPokemon{
	
	//List all the pokemon names that you have in your pokedex.
	public void listPokemon() {
		for(int i = 0; i < myPokemons.size(); i++) {
			System.out.println(myPokemons.get(i).getName());
		}
	}
	
	//This method returns a String with the name, health, and type of the pokemon.
	public String pokemonInfo(Pokemon pokemon) {
		String description = String.format("Pokemon %s has %d helath and is of type %s\n", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
		
		return description;
	}

}
