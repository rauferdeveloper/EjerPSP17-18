package ejercicio12;

public class EscribePingPong {
	public synchronized void escribePing(){
		System.out.println("ping");

	notify();
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public synchronized void escribePong(){
		System.out.println("pong");
		notify();

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
