package exercicio6;

import javax.swing.JOptionPane;
/*
 Na área da eletrônica, em um circuito em série temos que a resistência equivalente (total) desse circuito é obtida mediante 
 a soma de todas as resistências existentes (RE = r1 + r2 + ... + rn). 
 Faça uma classe que receba o valor de quatro resistências ligadas em série, 
 calcule e mostre a resistência equivalente, a maior e a menor resistência.
 */
public class Main {
	public static void main(String[] args) {
		double maiorValor, menorValor, resistencia1, resistencia2, resistencia3, resistencia4, resistenciaEquivalente;
		
		resistencia1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª resistência"));
		maiorValor = resistencia1;
		menorValor = resistencia1;
		
		resistencia2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª resistência "));
		maiorValor = setMaiorValor(maiorValor, resistencia2);
		maiorValor = setMenorValor(menorValor, resistencia2);
		
		resistencia3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 3ª resistência "));
		maiorValor = setMaiorValor(maiorValor, resistencia3);
		maiorValor = setMenorValor(menorValor, resistencia3);
		
		resistencia4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 4ª resistência "));
		maiorValor = setMaiorValor(maiorValor, resistencia4);
		maiorValor = setMenorValor(menorValor, resistencia4);
		
		resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;
		
		JOptionPane.showMessageDialog(null, "Resistência equivalente: " + resistenciaEquivalente + "\nMaior resistência: " + maiorValor + "\nMenor resistência: " + menorValor);
		
	}
	public static double setMaiorValor(double maiorValor, double valor) {
		if(maiorValor > valor) {
			return maiorValor;
		}else {
			return valor;
		}
	}
	public static double setMenorValor(double menorValor, double valor) {
		if(menorValor < valor) {
			return menorValor;
		}else {
			return valor;
		}
	}
}
