package exercícios_generation;

import java.util.Scanner;

public class LacoRepeticaoForExercicio2 {
	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		int num, x, somaPar=0, somaImpar=0; 
		
		
		for (x=1; x<=10; x++)
		{
		System.out.println("Entre com um valor: ");
		num = entrada.nextInt();
			
			if (num%2==0)
			   {
				somaPar++;
			   }
			else 
			{
				somaImpar++;
			}
		}
		System.out.println("Os números pares deram o total de: " +somaPar);
		System.out.println("Os números impares deram o total de: " +somaImpar);
		
	}
}
