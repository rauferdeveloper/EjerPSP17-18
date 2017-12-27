package ejercicio9;

public class Main {

	public static void main(String[] args) {
		Thread []thCorredores= new Thread[8];
		int posicion=1;
		AlmacenMeta almeta=new AlmacenMeta();
		for (int i = 0; i < thCorredores.length; i++) {
			thCorredores[i]=new Thread(new RnCorredor((i+1),almeta));
			
		}
		for (int i = 0; i < thCorredores.length; i++) {
			thCorredores[i].start();

		}
		for (int i = 0; i < thCorredores.length; i++) {
			try {
				thCorredores[i].join();
				

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Integer alm : almeta.sacarCorredores()) {
			System.out.println("Posicion: "+(posicion++)+" Corredor: "+alm);
		}
		System.out.println("Terminado el hilo Main");

	}

}
