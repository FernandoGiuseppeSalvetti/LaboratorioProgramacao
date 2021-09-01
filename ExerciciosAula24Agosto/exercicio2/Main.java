package exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. 
 * O novo valor a ser calculado deve ser arredondado para mais ou para menos usando o método round. 
 * A classe deve também conter um laço de repetição que encerre o programa quando o usuário fornecer o valor zero(0) para o valor do produto. 
 * Dessa forma, o usuário digita o valor do produto, a classe calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. 
 * Esse processo continua enquanto o valor do produto for diferente de zero; caso contrário o programa será encerrado

 */
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #.00");
		do {
			System.out.println("Digite o nome do produto: ");
			produto.setNome(teclado.next());
			System.out.println("Digite o valor do produto: ");
			produto.setPreco(teclado.nextDouble());
			if (produto.getPreco() > 0) {
				System.out.println("--------------------------");
				double precoAntigo = produto.getPreco();
				produto.calculaNovoPreco();
				System.out.println("Nome do produto: " + produto.getNome());
				System.out.println("Valor antigo: " + df.format(precoAntigo));
				System.out.println("Novo valor: " +  df.format(Math.round(produto.getPreco())));
				System.out.println("--------------------------");
			}
		} while (produto.getPreco() != 0);
		System.out.println("Encerrando programa...");
		teclado.close();
	}
}
