package exercicio2;

import javax.swing.JOptionPane;

public class Main {
	/*
	 O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel a ser negociado.
	 A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor entre o valor de transação (o valor negociado) 
	 e o valor venal de referência (fornecido pela Prefeitura). Com base nisso, elabore uma classe que receba o valor da transação,
	 o valor venal e o percentual de imposto. Após isso, encontre o maior valor e aplique o percentual sobre ele.
	 Ao final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a ser pago é calculado 
	 por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize a classe JOptionPane
	 */
	public static void main(String [] args){
		double valorDaTransacao, valorVenal, percentualDeImposto, valorDoImposto;
	    valorDaTransacao  =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da transação"));
	    valorVenal  =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor venal"));
	    percentualDeImposto  =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da porcentagem do imposto"));
	    if(valorDaTransacao >= valorVenal) {
	    	valorDoImposto = valorDaTransacao * percentualDeImposto / 100;
	    }else {
	    	valorDoImposto = valorVenal * percentualDeImposto / 100;
	    }
	    JOptionPane.showMessageDialog(null, "Valor do imposto a ser pago: " + valorDoImposto);
	}
}
