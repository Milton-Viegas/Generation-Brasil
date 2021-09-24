programa
{
	
	funcao inicio()
	{
	     inteiro idade,ano,mes,dias,dia,hoje=2021,a=365,m=12,d=31,ano_bi=7
	
		escreva("Insira quantos dias de vida você tem")

		escreva("\nDIAS:")
          leia(dias)
		 
          ano= hoje-(dias/a)
          escreva("Você é do ano de: ",ano)
          
          mes= ((hoje-ano)/m) * 2+1
          escreva("\nVocê é do mês: ",mes)
          
          dia= ((dias/m)/d)-ano_bi
          escreva("\nVocê é do dia: ",dia)
          
         
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */