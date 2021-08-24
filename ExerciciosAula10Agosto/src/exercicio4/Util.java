package exercicio4;

public class Util {
	public boolean validaTempoContribuicao(String sexo, int anosDeContribuicao) {
		if(sexo == "masculino") {
			if(anosDeContribuicao >= 35) {
				return true;	
			}
			return false;
		}else {
			if(anosDeContribuicao >= 30) {
				return true;	
			}
			return false;		
		}
	}
	public boolean validaIdade(String sexo, int idade, int anosDeContribuicao) {
		if(sexo.toLowerCase() == "masculino") {
			if(idade >= 65) {
				return true;	
			}
			return false;
		}else {
			if(anosDeContribuicao >= 60) {
				return true;	
			}
			return false;		
		}
	}
	public int calculaTempoRestanteContribuicao(String sexo, int idade, int anosDeContribuicao) {
		if(sexo.toLowerCase() == "masculino") {
			return 30 - anosDeContribuicao; 
		}else {
			return 35 - anosDeContribuicao;
		}
	}

	public String calculaTempoRestanteAposentadoria(String sexo, int idade, int anosDeContribuicao) {
		if(sexo.toLowerCase() == "masculino") {
			if(validaTempoContribuicao(sexo, anosDeContribuicao)) {
				if(validaIdade(sexo, idade, anosDeContribuicao) == false) {
					return "Voc� precisa trabalhar at� os 65 anos para se aposentar.";
				}
			}else {
				if(validaIdade(sexo, idade, anosDeContribuicao) == false) {
					return "Voc� precisa trabalhar at� os 65 anos para se aposentar, e contribuir mais " + calculaTempoRestanteContribuicao(sexo, idade, anosDeContribuicao) + " anos";
				}
				return "Voc� precisa contribuir mais " + calculaTempoRestanteContribuicao(sexo, idade, anosDeContribuicao) + " anos para se aposentar.";
			}
		} else {
			if(validaTempoContribuicao(sexo, anosDeContribuicao)) {
				if(validaIdade(sexo, idade, anosDeContribuicao) == false) {
					return "Voc� precisa trabalhar at� os 65 anos para se aposentar.";
				}
			}else {
				if(validaIdade(sexo, idade, anosDeContribuicao) == false) {
					return "Voc� precisa trabalhar at� os 65 anos para se aposentar, e contribuir mais " + calculaTempoRestanteContribuicao(sexo, idade, anosDeContribuicao) + " anos";
				}
				return "Voc� precisa contribuir mais " + calculaTempoRestanteContribuicao(sexo, idade, anosDeContribuicao) + " anos para se aposentar.";
			}
		}
		return "Sexo inv�lido";
	}

	public boolean podeAposentar(String sexo, int idade, int anosDeContribuicao) {
		if(validaIdade(sexo, idade, anosDeContribuicao) && validaTempoContribuicao(sexo, anosDeContribuicao)) {
			return true;
		}else{
			return false;
		}
	}

}
