package exercJava;

import java.util.Scanner;

public class FaixaIdade {
	
	public static void main(String[] args) {
		
		int idade;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=14) {
			System.out.println("Voc� est� na categoria: Infantil");
		} else if(idade>=18){
			System.out.println("Voc� est� na categoria: Adulto");
		} else {
			System.out.println("Voc� est� na categoria: Juvenil");
			leia.close();
		}
	}
}
