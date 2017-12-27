package ejercicio12;

public class EscribePong implements Runnable{
	private EscribePingPong escPong;
	

	public EscribePong(EscribePingPong escPong) {
		super();
		this.escPong = escPong;
	}


	@Override
	public void run() {
		while(true) {
			escPong.escribePong();

		}
	}
}
