package exerc18;

public class Veterinario {

	public String examinarAnimal(Animal animal) {
		return animal.getClass() + " " + animal.emiteSom();
	}

	public static void main(String[] args) {
		Animal a1 = new Cachorro("Paçoca", 4);
		Animal a2 = new Preguica("Soninho", 1);
		Animal a3 = new Cavalo("Zorro", 8);

		System.out.println(a1);
		System.out.println("\n"+a2);
		System.out.println("\n"+a3);

		Veterinario v1 = new Veterinario();
		System.out.println(v1.examinarAnimal(a1));
	}
}