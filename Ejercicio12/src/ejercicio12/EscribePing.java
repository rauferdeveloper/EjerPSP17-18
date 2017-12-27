package ejercicio12;

public class EscribePing implements Runnable{
	private EscribePingPong escPing;
	

	public EscribePing(EscribePingPong escPing) {
		super();
		this.escPing = escPing;
	}


	@Override
	public void run() {
		while (true) {
			
			escPing.escribePing();

		}
	}
}
