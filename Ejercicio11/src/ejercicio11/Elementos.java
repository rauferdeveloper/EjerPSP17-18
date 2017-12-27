package ejercicio11;

public class Elementos {
	private int cont;
	private int[] elementos;
	
	
	public Elementos(int num) {
		elementos=new int[num];
		cont=0;
	}
	public synchronized int sacarElemento() {
		if(cont==0) {
			System.out.println("Lista vacia");
			notify();

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return -1;
			
		}
		cont--;

		return elementos[cont];
		
		
	}
	public  synchronized boolean ponerElemento(int num) {
		if(cont==elementos.length) {
			System.out.println("Pila llena");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		if (num < 0) {
			System.out.println(num+" es negativo");
			
			return false;
		}
		for (int i = 0; i < elementos.length; i++) {
			if (num==elementos[i]) {
				System.out.println("Repetido: "+elementos[i]);
				
				return false;
			}
		}
		elementos[cont]=num;
		System.out.println("Se ha introducido el numero: "+elementos[cont]);
		cont++;

		return true;
	}
}
