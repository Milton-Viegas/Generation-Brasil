package exercJava;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totaldias,ano,mes,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira quantos dias de vida voc� tem: ");
		totaldias = leia.nextInt();
		
		ano = totaldias/365;
		mes = (totaldias%365)/30;
		dias = (totaldias%365)%30;
		
		System.out.println("Voc� tem "+ano+" anos, "+mes+" meses e "+dias+" dias");		
		leia.close();
	}

}
