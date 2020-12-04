package pokemon;

public class Pokemon implements PokemonInterface {
	//member variables
	private String name;
	private int health;
	private String type;
	
	//a count static variable that keeps the number of Pokemon created in the program.
	private static int count = 0;
	
	//constructor
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
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
		pokemon.health -= 10;
	}
	
	//these are from the interface
	Pokemon createPokemon(String name, int health, String type);//This method creates and returns Pokemon.
	String pokemonInfo(Pokemon pokemon);//This method returns a String with the name, health, and type of the pokemon.
	void listPokemon();//List all the pokemon names that you have in your pokedex.
	
	
	
	
}
