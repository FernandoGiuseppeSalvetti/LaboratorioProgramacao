package exercicio4;

import javax.swing.JOptionPane;
/*
 Considere a seguinte informação a respeito do cálculo da aposentadoria.
 Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65.
  Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens.
   Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição. 
   A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar, 
   ou então emita a mensagem: “você já tem o direito a aposentadoria”
 */
public class Main {
		public static void main(String [] args) {
			String sexo;
			int idade, anosDeContribuicao;
			Util util = new Util();
			sexo = JOptionPane.showInputDialog("Digite o seu sexo:");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
			anosDeContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu tempo de contribuição:"));
			if(util.podeAposentar(sexo, idade, anosDeContribuicao)) {
				JOptionPane.showMessageDialog(null, "Pode se aposentar");
			}else {
				JOptionPane.showMessageDialog(null, util.calculaTempoRestanteAposentadoria(sexo, idade, anosDeContribuicao));
			}
		}
}

