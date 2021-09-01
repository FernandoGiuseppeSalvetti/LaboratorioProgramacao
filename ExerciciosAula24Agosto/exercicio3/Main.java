package exercicio3;

/*
 Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. 
 Em seguida, faça com que apareça em tela uma senha numérica contendo a 
 mesma quantidade de dígitos correspondentes ao valor aleatório gerado. 
 Apresente em tela o número sorteado e a senha.
 */
public class Main {
	public static void main(String[] args) {
		final int MAIOR = 5;
		int numSorteado;
		Senha senha = new Senha();
		numSorteado = (int) (Math.random() * MAIOR + 5);
		for( int i = 0; i < numSorteado; i++) {
			senha.geraNumero();
		}
		System.out.printf("Senha gerada: %s", senha.getSenha());
	}
}
