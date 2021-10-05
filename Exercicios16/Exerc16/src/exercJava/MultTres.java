package exercJava;

import java.util.Scanner;

public class MultTres {

	public static void main(String[] args) {

		int soma = 0, num = 1, cont = 0;
		double media = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero (Zero encerra): ");
			num = leia.nextInt();
			if (num % 3 == 0 && num > 0) {
				soma += num;
				cont++;
			}
		} while (num != 0);

		media = soma / cont;
		System.out.printf("A media final é %.2f", media);

		leia.close();
	}
}
