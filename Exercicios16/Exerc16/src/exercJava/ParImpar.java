package exercJava;

//import java.util.Random;

public class ParImpar {

	public static void main(String[] args) {

		int x, par = 0, impar = 0;

		//Random gerador = new Random();
		
		for (x = 1; x <= 10; x++) {
			
			//x = gerador.nextInt(10);
			if (x % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		//System.out.println("Os 10 numeros aleatorios s�o: " + );
		System.out.println("Os numeros pares s�o: " +par);
		System.out.println("Os numeros impares s�o: " +impar);
		
	}

}
