package exercicio5;

import javax.swing.JOptionPane;

public class Main {
/*
Elabore uma classe que receba o nome de um produto e o seu valor.
O desconto deve ser calculado de acordo com o valor fornecido conforme a imagem.
 Utilizando a estrutura if-else, apresenta em tela o nome do produto, valor original do produto e o novo valor 
 depois de ser realizado o desconto. Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
*/
	public static void main(String[] args) {
		String nomeProduto;
		double valorProduto, novoValor, porcentagemDesconto;
		nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
		valorProduto = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor do produto")));
		if(valorProduto > 0) {
			if(valorProduto >= 50 && valorProduto < 200) {
				porcentagemDesconto = 5;
			}else {
				if(valorProduto >= 200 && valorProduto < 500) {
					porcentagemDesconto = 6;	
				}else {
					if(valorProduto >= 500 && valorProduto < 1000) {
						porcentagemDesconto = 7;		
					}else {
						porcentagemDesconto = 8;
					}
				}
			}
			novoValor = valorProduto - ((valorProduto * porcentagemDesconto) / 100);
			JOptionPane.showMessageDialog(null, "Nome do produto: " + nomeProduto + "\nValor Original do produto: " + valorProduto + "\nNovo valor com desconto: " + novoValor);
		}else {
			JOptionPane.showMessageDialog(null, "O valor do produto deve ser maior que 0");
		}
	}

}
