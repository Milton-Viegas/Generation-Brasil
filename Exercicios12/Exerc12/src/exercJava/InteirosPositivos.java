package exercJava;

import java.util.Scanner;

public class InteirosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		double D,R,S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o 1� numero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o 2� numero: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o 3� numero: ");
		n3 = (int) leia.nextFloat();
		
		R = Math.pow(n1+3, 2);
		S = Math.pow(n2+n3, 2);
		D = (R+S)/2;
		System.out.printf("O valor da express�o �: %2.2f",D);
		leia.close(); 
	}

}
