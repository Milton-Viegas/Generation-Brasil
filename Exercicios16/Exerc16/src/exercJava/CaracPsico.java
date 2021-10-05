package exercJava;

import java.util.Scanner;

public class CaracPsico {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" ");
		idade = leia.nextInt();
		
		if(idade<=14) {
			System.out.println("");
		} else if(idade>=18){
			System.out.println("");
		} else {
			System.out.println("");
			leia.close();
		}
	}

}
