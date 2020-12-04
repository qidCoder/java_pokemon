package pokemon;

//import java.util.ArrayList;

public class Pokemon {
	//member variables
	private String name;
	private int health;
	private String type;
	
	//a count static variable that keeps the number of Pokemon created in the program.
	static int count = 0;
	//static list to hold all pokemons for listing
//	private static ArrayList<Pokemon> allPokemons = new ArrayList<Pokemon>();
	
	//constructor
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
		
//		allPokemons.add(this);
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//methods
	//This method lowers the attacked Pokemon's health by 10
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
	
//	//these are from the interface
//	//This method creates and returns Pokemon.
//	public Pokemon createPokemon(String name, int health, String type) {
//		Pokemon newPokemon = new Pokemon(name, health, type);
//		
//		return newPokemon;
//	}
//	//This method returns a String with the name, health, and type of the pokemon.
//	public String pokemonInfo(Pokemon pokemon) {
//		String description = String.format("Name: %s, health: %d, type: %s", pokemon.name, pokemon.health, pokemon.type);
//		return description;
//	}
//	//List all the pokemon names that you have in your pokedex.
//	public void listPokemon() {
//		for(int i = 0; i < count; i++) {
//			System.out.println();
//		}
//	}
//	
	
	
	
}
