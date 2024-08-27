/*
 * Desenvolva um programa que use um 
 * loop while para gerar uma sequência de números pares a partir de 2
 * e imprima cada número na tela até que o número gerado seja maior do que 20.
 * 
 */
package quinto;

import java.util.Scanner;

public class sequenciaParesDois {
	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);

		int n = 2;
		
		do {
			if(n % 2 == 0) {
				System.out.println(n);
				n +=2;
			}
			
		} while (n <= 20);
	
		
		/* solution WHILE */
//		while (n <= 20) {
//			if (n % 2 == 0) {
//				System.out.println(n);
//				n += 2;
//			}
//		}
		
		/* 	"solution with For" solução for	*/
		
//		for(int i = 0; i <=19; i++) {
//			if (n % 2 == 0) {
//				System.out.println(n);
//				n += 2;
//			}
//		}
		
		/*	utiliznado Do While solution using do-while	*/
		
	
	}
}
