package exerc18;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom() {
		return "*dormindo*";
	}

	@Override
	public String andaLentamente() {
		return "*andando lentamente*";
	}

	@Override
	public String sobeEmArvores() {
		return "*subindo na árvore*";
	}

	@Override
	public String toString() {
		return super.nome + "\n" + super.idade + " ano(s)\n" + emiteSom() + "\n" + andaLentamente() + "\n" + sobeEmArvores();
	}

}
