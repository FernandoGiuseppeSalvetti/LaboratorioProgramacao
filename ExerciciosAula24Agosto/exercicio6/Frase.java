package exercicio6;

public class Frase {
	private String frase;
	
	public String getFrase() {
		return this.frase;
	}
	
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public String retornaFraseExcetoUltimoCaractere() {
		return this.frase.substring(0, this.frase.length() - 1);
	}
	
}
