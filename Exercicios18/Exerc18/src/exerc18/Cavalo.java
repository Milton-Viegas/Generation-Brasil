package exerc18;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom() {
		return "*alaz�o relinchando*";
	}

	@Override
	public String anda() {
		return "*alaz�o andando* pocot� pocot�";
	}

	@Override
	public String corre() {
		return "*Alaz�o trotando* Pocot�Pocot�";
	}

	@Override
	public String salta() {
		return "*Alaz�o saltando*";
	}

	@Override
	public String toString() {
		return super.nome + "\n" + super.idade + " ano(s)\n" + emiteSom() + "\n" + anda() + "\n" + corre() + "\n" + salta();
	}
}
