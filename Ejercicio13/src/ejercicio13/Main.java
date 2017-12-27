package ejercicio13;

public class Main {

	public static void main(String[] args) {
		EscribeUnoDosTres escribeUnoDosTres = new EscribeUnoDosTres();
		Thread thUno = new Thread(new EscribeUno(escribeUnoDosTres));
		Thread thDos = new Thread(new EscribeDos(escribeUnoDosTres));
		Thread thTres = new Thread(new EscribeTres(escribeUnoDosTres));
		thTres.start();
		thDos.start();
		thUno.start();
	}

}
