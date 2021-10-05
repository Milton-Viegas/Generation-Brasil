package exercJava;

import java.util.Scanner;

public class VariasIdades {

	public static void main(String[] args) {
		
		int idade=0,idademenor=0,idademaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade<=99) {
			System.out.println("Digite algumas idades: ");
			idade = leia.nextInt();
			
		if(idade<=21) {
			idademenor++;
			
		} else if(idade>=50){
			idademaior++;
		
		} else if(idade>98){
			System.out.println("Você não se enquadra em nenhuma idade de 0 a 98 anos");
			
		}
		
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+idademenor);
		System.out.println("Total de pessoas com mais de 50 anos: "+idademaior);
		leia.close();
	}

}
