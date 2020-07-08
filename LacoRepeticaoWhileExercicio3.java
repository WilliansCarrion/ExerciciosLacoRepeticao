package exercícios_generation;

import java.util.Scanner;

public class LacoRepeticaoWhileExercicio3 {
	
	public static void main (String args [])
	{
		Scanner entrada = new Scanner (System.in);
		int idade=0, somaIdadeMenor=0, somaIdadeMaior=0;
		
		while (idade!= -99)
		{
			if (idade <21) {
				somaIdadeMenor++;
			}
			else if (idade >50){
					somaIdadeMaior++;				
			}
			else {
				System.out.println("Idade fora do foco da pesquisa");
			}
		System.out.println("Entre com sua idade");
		idade = entrada.nextInt();
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é: " +somaIdadeMenor);
		System.out.println("O número de pessoa com mais de 50 anos é: " +somaIdadeMaior);
		
	}
}
