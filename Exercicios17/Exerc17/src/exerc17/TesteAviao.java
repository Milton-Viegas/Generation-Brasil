package exerc17;

public class TesteAviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();
		aviao1.companhia = "TAP";
		aviao1.acentos = 170;
		aviao1.staff = 6;

		System.out.printf("#--Companhia: %s--#\n\nNº de acentos: %d\nNº de pessoal de bordo: %d\n",
				aviao1.companhia, aviao1.acentos, aviao1.staff);

		aviao1.aviaoligado();
		aviao1.colocarvoo();
	}
}
