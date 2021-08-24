package exercicio1;

import java.util.Scanner;
/**
 Usando a classe Scanner para entrada de dados,
 crie uma classe que receba o valor de um produto e
 a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto
**/

public class Main {
    public static void main(String [] args) {
        double valorDoProduto, porcentagemDesconto, valorDoDesconto, valorDoProdutoComDesconto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        valorDoProduto = teclado.nextDouble();

        System.out.println("Digite o valor da porcentagem do desconto:");
        porcentagemDesconto = teclado.nextDouble();

        valorDoDesconto = valorDoProduto * porcentagemDesconto / 100;
        valorDoProdutoComDesconto = valorDoProduto - valorDoDesconto;
        System.out.printf("Valor do desconto: R$ %.2f", valorDoDesconto);
        System.out.printf("\nValor do produto com o desconto: R$ %.2f", valorDoProdutoComDesconto);
        teclado.close();
    }
}
