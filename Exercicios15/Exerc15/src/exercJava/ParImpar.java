package exercJava;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		double num,raiz,elevado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			raiz = Math.sqrt(num);
			System.out.printf("O numero é par e sua raiz² é: %2.2f",raiz);
		} else {
			elevado = Math.pow(num, 2);
			System.out.printf("O numero é impar e elevado² é: %2.2f",elevado);
		
		leia.close();
		}
	}
}
