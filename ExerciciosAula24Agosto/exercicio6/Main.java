package exercicio6;

import java.util.Scanner;

/*
 * 6 - Crie uma classe que exiba o substring de uma string FRASE composto por todos os caracteres de FRASE exceto o último caracter.
 */
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Frase frase = new Frase();
		System.out.println("Digite uma frase:");
		frase.setFrase(teclado.nextLine());
		System.out.println(frase.retornaFraseExcetoUltimoCaractere());
	}
}
