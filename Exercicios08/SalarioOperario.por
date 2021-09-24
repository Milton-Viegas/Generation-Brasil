programa
{
	
	funcao inicio()
	{
		inteiro C,N
		real salario,E,H=10.0
		escreva("Digite o código do operário:")
		leia(C)
		escreva("Digite as horas trabalhadas:")
		leia(N)

		salario=N*H
		se (N>50)
		{
			E=(N-50)*20			
			escreva("O operário ",C," tem a receber de salário total: ",salario,"R$ e de salário excedente: ",E,"R$")
		}
		senao
		{
			E=0
			escreva("O operário ",C," tem a receber de salário total: ",salario,"R$ e de salário excedente: ",E,"R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */