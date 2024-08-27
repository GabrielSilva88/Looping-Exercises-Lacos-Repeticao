/*
	Crie um programa que receba um número inteiro e calcule a soma dos seus dígitos.
*/
package terceiro;

import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;// SOMAR O DIGITO

		System.out.println("Calculadora de Número do inteiro\n\r Digite um número: ");
		int num = scan.nextInt(); // INTEIRO DIGITADO

		// GEMINI IA GOOGLE
		while (num > 0) {
			int digito = num % 10;
			soma += num;
			num /= 10;
		}

		// CALCULAR SOMANA DOS NÚMEROS.
//		for (int i = 0; i <= num; i++) {
//			int b = num % 10;
//			soma += b;
//
//		}
		System.out.println(num + " Valor digitado, Soma dos valores é " + soma);
	}
}
