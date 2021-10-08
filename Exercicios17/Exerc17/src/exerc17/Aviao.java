package exerc17;

import java.util.Scanner;

public class Aviao {

	Scanner leia = new Scanner(System.in);

	String companhia;
	int acentos;
	int staff;

	public boolean aviaoligado() {
		int pergunta = 0;
		System.out.println("avião esta ligado? \n[1] Sim\t[2] Não");
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

		System.out.println("Deseja colocar o avião em voo? \n[1] Sim\t[2] Não");
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
			System.out.println("O avião está ligado!");
			estado = true;
		} else {
			System.out.println("O avião está desligado!");
			estado = false;
		}
		return estado;
	}
	public boolean emVoo(boolean estado) {
		
		if (estado == true) {
			System.out.println("O avião está no AR!");
			estado = true;
		} else {
			System.out.println("O avião está em TERRA!");
			estado = false;
		}
		return estado;
	}
}
