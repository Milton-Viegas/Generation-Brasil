programa
{
	
	funcao inicio()
	{    
		real P, E, M
		
		escreva("Digite o peso dos tomates:")
		leia(P)
		se (P>50)
		{
			E=P-50
			M=E*4			
			escreva("Você excedeu ",E,"Kg dos 50Kg estabelecidos pelo Estado, e deverá pagar uma multa de: ",M,"R$")
		}
		senao
		{
			escreva("Você excedeu 0.0Kg dos 50Kg estabelecidos pelo Estado, e deverá pagar uma multa de: 0.0R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */