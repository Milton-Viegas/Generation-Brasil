package exercJava;

import java.util.Scanner;

public class InteiroMaior {

	public static void main(String[] args) {
		
		int n1,n2,n3;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o 1ª numero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o 2ª numero: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o 3ª numero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" é o maior numero!");
		} else if(n2>n1 && n2>n3){
			System.out.println(n2+" é o maior numero!");
		} else {
			System.out.println(n3+" é o maior numero!");
		}
		leia.close(); 
	}
}
