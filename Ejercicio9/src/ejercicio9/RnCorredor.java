package ejercicio9;

public class RnCorredor implements Runnable {
	private int numCorredor;
	private AlmacenMeta alMeta;
	public RnCorredor(int numCorredor,AlmacenMeta alMeta) {
		this.numCorredor=numCorredor;
		this.alMeta=alMeta;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10000; i++);
		alMeta.add(numCorredor);
		
	}


	
}
