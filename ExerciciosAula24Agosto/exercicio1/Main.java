package exercicio1;

/*
 	Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6) por três vezes. Ao  final some seus valores e apresente o resultado das três jogadas.
*/

public class Main {
	public static void main(String[] args) {
		final int RODADAS = 3;
		int i, somaTotal = 0;
		Dado dado = new Dado(6);
		
		for(i = 0; i < RODADAS; i++) {
			System.out.printf("%dª rodada \n", i + 1);
			System.out.println("Jogando o dado...");
			int numSorteado = dado.jogaDado();
			System.out.printf("Número: %d\n", numSorteado);
			somaTotal += numSorteado;
			System.out.println("------------------------");
		}
		System.out.printf("Soma total: %d", somaTotal);
	}
}
