package pokemon;

public class Tester {

	public static void main(String[] args) {
		Pokemon shelley = new Pokemon("Shelley", 100, "dragon");
		System.out.println(shelley.getHealth());
		System.out.println(shelley.getName());
		System.out.println(shelley.getType());
	}

}
