package exercicio5;
/*
 * Elabore uma classe que receba uma frase e verique que se essa frase possui palavras impróprias.
 *  As palavras impróprias são: sexo e sexual.
 * Caso encontre uma dessas palavras, emita em tela a mensagem “conteúdo impróprio”, caso contrário “conteúdo liberado”,  
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Frase frase = new Frase();
		
		System.out.println("Digite uma frase:");
		
		frase.setFrase(teclado.nextLine());
		
		if(frase.verificaSePossuiPalavrasImproprias()) {
			System.out.println("Conteúdo impróprio");
		}else {
			System.out.println("Conteúdo liberado");
		}
		
		
	}
}
