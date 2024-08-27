/* Peça ao usuário para inserir um número e imprima a tabuada desse número de 1 a 10. */

package quarto;

import java.util.Scanner;

public class TabuadaNumero {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n =0;
		int cont = 0; // repetition loops WHILE & DO WHILE;
		System.out.println("Imprime a tabuada de um número com sua resposta!\nDigite um número:");
		n = scan.nextInt();
		/*
		for (int i = 0; i < 11; i++) {
			int mult = n * i;
			System.out.println(n +" X "+ i + " = " + mult);
		}*/
		
		
		/*  
		while ( cont < 11) {
			cont ++;
			int mult = n * cont;
			System.out.println(n +" X "+ cont + " = " + mult);
		}*/
		
		do {
			cont ++;
			int mult = n * cont;
			System.out.println(n +" X "+ cont + " = " + mult);
		} while (cont < 10);
	}
}
/*
	the meters didn't start when they were working, they gave the message loop;
*/