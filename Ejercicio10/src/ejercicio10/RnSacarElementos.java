package ejercicio10;


public class RnSacarElementos implements Runnable {
	private Elementos elementos;
	public RnSacarElementos(Elementos elementos) {
		this.elementos=elementos;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Se ha extraido el "+elementos.sacarElemento());
		}
	}

}
