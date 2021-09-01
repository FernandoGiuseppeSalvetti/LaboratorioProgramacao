package exercicio4;

import java.util.Scanner;

/*
 * Construa uma classe que receba uma frase qualquer e mostre essa frase de trás 
 * para a frente e sem espaços em branco,
 */
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Frase frase = new Frase();
		System.out.println("Digite uma frase");
		frase.setTexto(teclado.nextLine());
		System.out.println(frase.inverteTexto());
		teclado.close();
	}
}
