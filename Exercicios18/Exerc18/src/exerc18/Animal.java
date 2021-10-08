package exerc18;

public class Animal {

	protected String nome;
	protected int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String emiteSom() {
		return " ";
	}

	public String anda() {
		return " ";
	}

	public String corre() {
		return " ";
	}

	public String andaLentamente() {
		return " ";
	}

	public String sobeEmArvores() {
		return " ";
	}

	public String salta() {
		return " ";
	}

	public String toString() {
		return nome + "\n" + idade + "\n" + emiteSom() + "\n" + anda() + "\n" + corre() + "\n" + anda() + "\n"
				+ sobeEmArvores() + "\n" + andaLentamente() + "\n" + salta();
	}

}
