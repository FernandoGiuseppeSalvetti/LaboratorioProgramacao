package exercicio4;

public class Frase {
	private String texto;
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTexto() {
		return texto;
	}
	public String inverteTexto() {
		String texto = "";
		for(int i = this.texto.length() - 1; i >= 0 ; i --) {
			texto += this.texto.charAt(i);
		}
		return texto;
	}
}
