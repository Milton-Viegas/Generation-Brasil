package exercJava;

import java.util.Scanner;

public class InteiroMaior {

	public static void main(String[] args) {
		
		int n1,n2,n3;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o 1� numero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o 2� numero: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o 3� numero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" � o maior numero!");
		} else if(n2>n1 && n2>n3){
			System.out.println(n2+" � o maior numero!");
		} else {
			System.out.println(n3+" � o maior numero!");
		}
		leia.close(); 
	}
}
