package ejercicio14;


public class Ladron implements Runnable {
	private CajaFuerte cajaF;
	private int idLadron;
	public Ladron(int idLadron,CajaFuerte cajaF) {
		this.cajaF=cajaF;
		this.idLadron=idLadron;
	}
	@Override
	public void run() {
		while (cajaF.sacaLadron(idLadron)) {}
	}
}
