package ejercicio13;

public class EscribeUnoDosTres {
	private int cont=1;
	public synchronized void escribeUno(){
		if(cont==1) {
			System.out.println(cont);
			cont++;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void escribeDos(){
		if(cont==2) {
			System.out.println(cont);
			cont++;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void escribeTres(){
		if(cont==3) {
			System.out.println(cont);
			cont=1;
		}		
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
