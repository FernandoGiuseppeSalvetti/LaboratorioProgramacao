package exercicio3;

public class Senha {
	private String senha;
	private final int LIMITE = 10;
	public Senha() {
		this.senha = "";
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void geraNumero(){
		this.senha = this.senha.concat(String.valueOf((int)(Math.random() * LIMITE)));
	}
}
