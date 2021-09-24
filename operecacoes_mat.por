
/* Testes com base na aula da Generation Brasil*/
 
programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio () 
	{
		inteiro n1,n2,operacao
		escreva("Digite o 1º numero: ")
		leia(n1)
		escreva("Digite o 2º numero: ")
		leia(n2)
		operacao= n1+n2
		escreva("Resultado da soma: ",operacao)
		operacao= n1-n2
		escreva("\nResultado da subtração: ",operacao)
		operacao= n1*n2
		escreva("\nResultado da multiplicação: ",operacao)
		operacao= n1/n2
		escreva("\nResultado da divisão: ",mat.arredondar(operacao,2))
		operacao= n1%n2
		escreva("\nResultado do resto da divisão: ",operacao)
		escreva("\nn1 é menor que n2?: ",n1<n2)
		escreva("\nn1 é maior que n2?: ",n1>n2)
		escreva("\nn1 é igual a n2?: ",n1==n2)
		escreva("\nn1 é diferente a n2?: ",n1!=n2)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */