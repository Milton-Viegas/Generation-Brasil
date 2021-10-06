package exercArrays1;

import java.util.Scanner;

public class SeisInteiros {

	public static void main(String[] args) {

		int[] num = new int[6];
		int x, par = 0, impar = 0;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++) {
			System.out.println("Entre com um numero: ");
			num[x] = leia.nextInt();
		}
		for (x = 0; x < 6; x++) {
			if (num[x] % 2 == 0) {
				System.out.println("\nPares digitados: "+num[x]);
				
				par += num[x];
			} else {
				impar++;
				
				System.out.println("Impares digitados: "+num[x]);
			}
		}
		System.out.println("A soma dos numeros pares digitados: "+par);
		System.out.println("A quantidade de numeros ímpares digitados: " +impar);
		leia.close();
	}
}
