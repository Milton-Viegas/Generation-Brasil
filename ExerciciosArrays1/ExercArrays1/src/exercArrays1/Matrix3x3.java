package exercArrays1;

import java.util.Scanner;

public class Matrix3x3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int x,y,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<3; x++) {
			
			for(y=0; y<3; y++) {
				
				System.out.printf("Digite os numeros da Matriz[%d][%d]: ",x+1,y+1);
				matriz[x][y] = leia.nextInt();
			}
		}
		for(x=0; x<3; x++) {
			
			for(y=0; y<3; y++) {
				
				if(matriz[x][y]>10) {
				
				cont++;
		        }
			}
		}		
		System.out.println("R: 0"+cont+" valores são maiores que 10");
	}
}
