package exercArrays1;

public class VetorA {

	public static void main(String[] args) {

		int A[] = {1, 0, 5, -2, -5, 7};
		int x=0,soma=0;
		
		//Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			soma = A[0] + A[1] + A[5];
			
			A[4]=100;
		}
		System.out.printf("Soma dos vetores [0][1][5]: %d\n",soma);
		
		for(x=0;x<6;x++) {
			System.out.printf("\nValores do vetor A, posição %d: %d",x+1,A[x]);
			//leia.close();
		}
	}
}
