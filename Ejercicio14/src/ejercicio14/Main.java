package ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de lingotes");
		int lingotes = sc.nextInt();
		System.out.println("Introduce la cantidad de ladrones");
		int cantLadrones = sc.nextInt();
		Ladron[]ladrones=new Ladron[cantLadrones];
		CajaFuerte cajaF=new CajaFuerte(lingotes, cantLadrones);
		for (int i = 0; i < ladrones.length; i++) {
			ladrones[i]=new Ladron(i+1,cajaF);
			new Thread(ladrones[i]).start();

		}
		sc.close();
		
	}

}
