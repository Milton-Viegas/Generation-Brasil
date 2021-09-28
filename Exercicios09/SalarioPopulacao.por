programa
{
	
	funcao inicio()
	{
		inteiro sal,medsal=0,maiorsal=0,totalsal=0,numf,medf=0,totalf=0,perc=0,x

		para(x=0; x<=20; x++)
		{
			escreva("\nDigite o numero de filhos: ")
			leia(numf)
			escreva("Digite o salário: ")
			leia(sal)
			
			totalsal = totalsal + sal
               totalf = totalf + numf

               se (x==0)
               {
   	         		maiorsal = sal
               }
    
               se (sal > maiorsal)
               {
               	maiorsal = sal
               }              
 
   			se (sal <= 100)
   			{
   				perc = perc + 1
   			}
                
  			 x = x + 1
   
               se (sal < 0)
               {
               	pare
               }

               medsal = totalsal / x  
               medf = totalf / x    
               perc = perc * 100 / x     

               escreva("\nA média de sálario da população é de ",medsal,"R$")
               escreva("\nA média do nº de filhos é ", medf)
               escreva("\nO maior sálario é de ", maiorsal)
               escreva("\nO percentual de pessoas com salário até R$100,00: ",perc)

        		// voltar !!!
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1136; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */