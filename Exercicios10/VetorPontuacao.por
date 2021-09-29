programa
{
	
	funcao inicio()
	{	
		inteiro valor[5],maiorNum=0,x

		 para(x=0; x<=4; x++)
		 {
		 	escreva("Digite a ",x+1,"° pontuação: ")
		 	leia(valor[x])
		 }
		 para(x=0; x<=4; x++)
		 {
		 	escreva("\n",x+1,"° pontuação: ",valor[x])
		 	 se(valor[x] > maiorNum)
		 	 {
		 		maiorNum = valor[x]
			 }
		 }
		     escreva("\nA maior pontuação é: ", maiorNum)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */