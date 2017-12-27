package ejercicio13;

public class EscribeTres implements Runnable {
private EscribeUnoDosTres escTres;

	public EscribeTres(EscribeUnoDosTres escTres) {
		super();
		this.escTres = escTres;
	}

	@Override
	public void run() {
		while (true) {
			escTres.escribeTres();
		}
	}

}
