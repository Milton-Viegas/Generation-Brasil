package collections3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao2 {

	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean continuaLoop = true;

		do {
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();

				int result = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, result);
				continuaLoop = false;

			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc? deve entrar com um valor do tipo inteiro...\nPor favor, tente novamente...");

			} catch (ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("\nZero ? um denominador inv?lido...\nPor favor, tente novamente...");

			}
		} while (continuaLoop);
	}
}
