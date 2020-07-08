package exercícios_generation;

import java.util.Scanner;

public class LacoRepeticaoDoWhileExercicio5 {
	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		int numeroDigitado=0, somaNumeros=0;
		
		do  
		{
			if (numeroDigitado>0) {
				somaNumeros = numeroDigitado + somaNumeros;
				somaNumeros++;
			}

			System.out.println("Digite o número desejado");
			numeroDigitado = entrada.nextInt();	
		}
		while (numeroDigitado!=0);
		
		System.out.println("A soma dos números digitados é: " +somaNumeros);
		
	}
}


