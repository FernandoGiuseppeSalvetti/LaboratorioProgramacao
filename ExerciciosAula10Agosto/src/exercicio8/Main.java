package exercicio8;

import java.util.Scanner;
/*
 Faça uma classe que apresente em tela a tabuada de qualquer número.
 O usuário fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10. 
 */
public class Main {
    public static void main(String []args) {
        Scanner teclado = new Scanner(System.in);
        int i, nTabuada, opcao = 2;
        while( opcao != 0) {
            System.out.println("");
            System.out.println("\nMenu\n0 - Sair\n1 - Imprimir tabuada");
            opcao = teclado.nextInt();
            if(opcao == 1) {
                System.out.println("Digite um número decimal que você deseja saber a tabuada: ");
                nTabuada = teclado.nextInt();
                for(i = 0; i < 11; i++) {
                    System.out.printf("\n%d x %d = %d", i , nTabuada, i * nTabuada);
                }
            }else {
                if(opcao == 0) {
                    System.out.println("Encerrando programa...");
                }else {
                    System.out.println("Digite uma opção disponível no menu!");
                }
            }
        }
    }
}
