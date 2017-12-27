package ejercicio9;

import java.util.ArrayList;


public class AlmacenMeta {
	private ArrayList<Integer>ay;
	public AlmacenMeta() {
		ay = new ArrayList<>();
	}
	public  synchronized void add(int rnc){
		ay.add(rnc);
	}
	public ArrayList<Integer> sacarCorredores() {
		return ay;
	}
}
