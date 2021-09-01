package exercicio2;

public class Produto {
	private final static double PERCENTUAL = 1.12;
	private String nome;
	private double preco;

	public void calculaNovoPreco() {
		this.preco *=  PERCENTUAL;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String string) {
		this.nome = string;
	}
	
}
