package hilos;

import java.util.Iterator;
import java.util.TreeSet;

public class AlmacenOrdenadoSincronizado {
	private TreeSet<Integer>ts;
	public AlmacenOrdenadoSincronizado() {
		ts = new TreeSet<>();
	}
	public  synchronized void add(int num){
		ts.add(num);
	}
	public Iterator<Integer> getIterator(){
		return ts.iterator();
	}
}
