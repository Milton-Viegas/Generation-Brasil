package exerc18;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom() {
		return "*latindo* Au au au";
	}

	@Override
	public String anda() {
		return "*doguinho andando*";
	}

	@Override
	public String corre() {
		return "doguinho correndo";
	}

	@Override
	public String toString() {
		return "\n" + super.nome + "\n" + super.idade + " ano(s)\n" + emiteSom() + "\n" + anda() + "\n" + corre();
	}
}
