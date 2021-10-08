package exerc18;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom() {
		return "*alazão relinchando*";
	}

	@Override
	public String anda() {
		return "*alazão andando* pocotó pocotó";
	}

	@Override
	public String corre() {
		return "*Alazão trotando* PocotóPocotó";
	}

	@Override
	public String salta() {
		return "*Alazão saltando*";
	}

	@Override
	public String toString() {
		return super.nome + "\n" + super.idade + " ano(s)\n" + emiteSom() + "\n" + anda() + "\n" + corre() + "\n" + salta();
	}
}
