package pokemon;

public class Pokemon {
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
	
	
	
	
}
