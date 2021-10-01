package exercJava;

import java.util.Scanner;

public class EventoFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seg,hrs,min,segs;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Duração do evento na fábrica em segundos: ");
		seg = leia.nextInt();
		
		hrs = (seg*1)/3600;
		min = (seg*1)/60;
		segs = seg*1;
		
		System.out.println("O evento durou: "+hrs+" Horas "+min+" Minutos e "+segs+" Segundos");
		leia.close();
	}

}
