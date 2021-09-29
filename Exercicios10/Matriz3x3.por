programa
{
	
	funcao inicio()
	{
		 const inteiro LIMITEL=3,LIMITEC=3
		 inteiro valor[LIMITEL][LIMITEC],l=0,c=0
		 inteiro somaDiag=0,somaTotal=0

		 para(l=0; l< LIMITEL; l++)
		 {
		 	para(c = 0; c < LIMITEC; c++)
		 	{
		 		limpa()
		 		escreva("Insira o valor para linha ", l+1, ", coluna ", c+1, ": ")
		 		leia(valor[l][c])
		 		se(l == c)
		 		{
		 			somaDiag += valor[l][c]
		 		}
		 			somaTotal += valor[l][c]
		 	}	  	
		 }
		 		escreva("A soma dos valores da 1ª diagonal é: ",somaDiag)
		 		escreva("\nA soma dos valores da matriz é: ",somaTotal)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */