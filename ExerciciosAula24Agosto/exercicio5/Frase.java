package exercicio5;

public class Frase {
	private String frase;

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public boolean verificaSePossuiPalavrasImproprias() {
		if (this.frase.contains("sexo") || this.frase.contains("sexual")) {
			return true;
		}
		return false;
	}
}
