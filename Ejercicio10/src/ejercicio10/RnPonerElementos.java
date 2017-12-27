package ejercicio10;

import java.util.Random;

public class RnPonerElementos implements Runnable {
	private Elementos elementos;
	public RnPonerElementos(Elementos elementos) {
		this.elementos=elementos;
	}

	@Override
	public void run() {
		Random rnd = new Random();
		while(true) {
			elementos.ponerElemento(rnd.nextInt(10)+0);

		}
	}

}
