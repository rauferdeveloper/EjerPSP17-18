package ejercicio10;

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
			return -1;
		}
		cont--;
		return elementos[cont];
		
		
	}
	public  boolean ponerElemento(int num) {
		if(cont==elementos.length) {
			System.out.println("Pila llena");
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
