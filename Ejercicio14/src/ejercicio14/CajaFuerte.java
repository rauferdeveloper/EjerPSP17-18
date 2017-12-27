package ejercicio14;
import java.util.Random;
public class CajaFuerte{
	private int cantLingotes;
	private Random rnd=new Random();
	private int num;
	private int operacion;
	private int cantLadrones;
	public CajaFuerte(int cantLingotes,int cantLadrones) {
		super();
		this.cantLingotes = cantLingotes;
		this.cantLadrones=cantLadrones;
		
	}
	public int getCantLingotes() {
		return cantLingotes;
	}


	public void setCantLingotes(int cantLingotes) {
		this.cantLingotes = cantLingotes;
	}
	
	
	
	public synchronized boolean sacaLadron(int idLadron){
		num=rnd.nextInt(6)+1;
			if(num <=getCantLingotes()) {
				operacion = getCantLingotes()-num;
				System.out.println("El ladron "+idLadron+" ha sacado "+num+" lingotes");
				setCantLingotes(operacion);
				System.out.println("Quedan "+operacion+" lingotes");
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}else {
				System.out.println("El ladrón "+idLadron+" no puede sacar 5 y finaliza.");
				notify();
				return false;
			}
			
	}

}
