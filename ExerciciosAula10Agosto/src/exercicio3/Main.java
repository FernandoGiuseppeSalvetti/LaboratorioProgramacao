package exercicio3;

import javax.swing.JOptionPane;

public class Main {
	/*
	 Usando a classe JOptionPane para entrada de dados,
	  elabore uma classe que receba a nota de duas provas e de um trabalho.
	  Calcule e mostre a média e o resultado final (aprovado ou reprovado).
	   Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3.
	    Considere que a média mínima para aprovação é 6. 
	*/
public static void main(String[] args) {
		
		double nota1, nota2, notaTrabalho, media;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º nota"));
		
		notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho"));
		
		media = (nota1 + nota2 + notaTrabalho) / 3;
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
	}
}
