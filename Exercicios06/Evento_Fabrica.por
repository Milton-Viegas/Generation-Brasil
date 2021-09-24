programa
{
	
	funcao inicio()
	{    
	     inteiro seg,hrs,min,segs
		escreva("Duração do evento na fábrica")

		escreva("\nEm Segundos:")
		leia(seg)

		hrs= (seg*1)/3600
		min= (seg*1)/60
		segs= seg*1
		escreva("\nO evento durou: ",hrs," Horas ",min," Minutos e ",segs," Segundos")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */