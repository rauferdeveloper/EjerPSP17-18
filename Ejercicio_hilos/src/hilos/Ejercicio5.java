package hilos;

import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio5 {
	private static final int NUM = 1000000;

	public static void main(String[] args) {
		AlmacenOrdenadoSincronizado almacen = new AlmacenOrdenadoSincronizado();
		Runtime runtime = Runtime.getRuntime();
		int cantidadNucleos=runtime.availableProcessors();
		int rango = Math.round(NUM/(float)cantidadNucleos);
		int inicio = 2;
		int fin=rango;
		Thread[] threads= new Thread[cantidadNucleos];
		for (int i = 0; i < cantidadNucleos; i++) {
			threads[i]=new Thread(new RnBuscaPrimos(inicio, fin,almacen));
			threads[i].start();
			inicio+=rango;
			fin +=rango;
			if(i==cantidadNucleos -2) {
				fin = NUM+1;
			}
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int cont=0;
		Iterator<Integer>iterator = almacen.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			cont++;
		}
		System.out.println(cont);
	}
	public static class RnBuscaPrimos implements Runnable{
		private int inicio;
		private int fin;
		private AlmacenOrdenadoSincronizado almacen;
		public RnBuscaPrimos(int inicio, int fin,AlmacenOrdenadoSincronizado almacen){
		this.inicio = inicio;
		this.fin = fin;
		this.almacen=almacen;
		} 
		@Override
		public void run(){
			for (int i = inicio; i <=fin; i++) {
				if(esPrimo(i)) {
					almacen.add(i);
				}
					
			}
	
		}
		
	}
	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i ==0) {
				return false;
			}
		}
		return true;
	}
}
