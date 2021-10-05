package exercJava;

import java.util.Scanner;

public class IgualZero {

	public static void main(String[] args) {

		int num = 0, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite um numero (zero encerra): ");
			num = leia.nextInt();

			soma += num;

		} while (num > 0);
		if (num == 0) {
			System.out.printf("Zero digitado! Total da soma dos numeros inseridos: %d", soma);
			leia.close();
		}
	}
}