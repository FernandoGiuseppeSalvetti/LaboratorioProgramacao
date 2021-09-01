package exercicio1;

public class Dado {
	private int faces;
	
	public Dado(int faces) {
		this.faces = faces;
	}
	
	
	public int getFaces() {
		return faces;
	}
	
	public int jogaDado() {
		return (int) (Math.random() * this.faces + 1);
	}
	
}
