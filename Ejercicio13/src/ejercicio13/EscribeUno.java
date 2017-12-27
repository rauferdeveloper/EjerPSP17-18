package ejercicio13;

public class EscribeUno implements Runnable {
private EscribeUnoDosTres escUno;

	public EscribeUno(EscribeUnoDosTres escUno) {
		super();
		this.escUno = escUno;
	}

	@Override
	public void run() {
		while (true) {
			escUno.escribeUno();
		}
	}

}
