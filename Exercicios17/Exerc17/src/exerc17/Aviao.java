package exerc17;

import java.util.Scanner;

public class Aviao {

	Scanner leia = new Scanner(System.in);

	String companhia;
	int acentos;
	int staff;

	public boolean aviaoligado() {
		int pergunta = 0;
		System.out.println("avi�o esta ligado? \n[1] Sim\t[2] N�o");
		pergunta = leia.nextInt();
		boolean ligado;

		if (pergunta == 1) {
			ligado = true;
		} else {
			ligado = false;
		}
		return ligado(ligado);
	}
	public boolean colocarvoo() {
		int pergunta2 = 0;
		boolean voo;

		System.out.println("Deseja colocar o avi�o em voo? \n[1] Sim\t[2] N�o");
		pergunta2 = leia.nextInt();
		
		if (pergunta2 == 1) {
			voo = true;
		} else {
			voo = false;
		}
		return emVoo(voo);
	}
	public boolean ligado(boolean estado) {
		
		if (estado == true) {
			System.out.println("O avi�o est� ligado!");
			estado = true;
		} else {
			System.out.println("O avi�o est� desligado!");
			estado = false;
		}
		return estado;
	}
	public boolean emVoo(boolean estado) {
		
		if (estado == true) {
			System.out.println("O avi�o est� no AR!");
			estado = true;
		} else {
			System.out.println("O avi�o est� em TERRA!");
			estado = false;
		}
		return estado;
	}
}
