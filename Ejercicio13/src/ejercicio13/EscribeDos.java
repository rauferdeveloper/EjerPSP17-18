package ejercicio13;

public class EscribeDos implements Runnable {
private EscribeUnoDosTres escDos;

	public EscribeDos(EscribeUnoDosTres escDos) {
		super();
		this.escDos = escDos;
	}

	@Override
	public void run() {
		while (true) {
			escDos.escribeDos();
		}
	}


}
