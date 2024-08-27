/*  Implemente um jogo em que o computador escolhe um número aleatório entre 1 e 100, e o jogador tenta adivinhar. 
 *  O jogo continua até que o jogador acerte o número.
 */
package segundo;

import java.util.Random;
import java.util.Scanner;

public class SorteioNumerico {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		int aleatorio = r.nextInt(101);
		int chute = 0;

		/* DO {} While(); */

		do {
			aleatorio = r.nextInt(101);
			System.out.println("Digite um Número: ");
			chute = scan.nextInt();

			if (chute != aleatorio) {
				System.out.println(chute + " Não Acertou, número correto é " + aleatorio);
			} else {
				System.out.println(chute + " Acertou, Número correto é " + aleatorio);
				break;
			}

		} while (chute != aleatorio);

		/* WHILE () {} */
		/*
		 while (aleatorio != chute) {
			aleatorio = r.nextInt(101);

			System.out.println("Digite um numero: ");
			chute = scan.nextInt();

			if (aleatorio != chute) {
				if (aleatorio != chute && chute > 101) {
					System.out.println("Errou o numeros digitado e Maior: " + aleatorio + " e Digitado: " + chute);
				} else {
					System.out.println(
							"Acetou os dois numeros são iguais\nAleatorio: " + aleatorio + " e Digitado: " + chute);
				}

			} else {
				System.out.println("Valor digitado não esta entre 1 e 100 ");
			}
		}
		 */

		/* FOR () {} 
		 	  
		for (int i = 0; i < 101; i++) {
			aleatorio = r.nextInt(101);
			System.out.println("Digite uma numero: ");

			if (aleatorio != chute) {
				if (aleatorio != chute && chute > 101) {
					System.out.println("Errou o numeros digitado e Maior: " + aleatorio + " e Digitado: " + chute);
				} else {
					System.out.println(
							"Acetou os dois numeros são iguais\nAleatorio: " + aleatorio + " e Digitado: " + chute);
				}

			} else {
				System.out.println("Valor digitado não esta entre 1 e 100 ");
			}
		} */
		
		 
	}

}
