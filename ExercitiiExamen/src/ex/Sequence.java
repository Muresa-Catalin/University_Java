package ex;

public class Sequence implements Selector {
	private Object items[];
	private int size;
	private int next;
	private int iSelector = 0;
	
	public boolean end() {
		return iSelector > next - 1;
	}
	
	public Object current() {
		return items[iSelector];
	}
	
	public void next() {
		iSelector++;
	}
	
	public Sequence(int sz) {
		size = sz;
		next = 0;
		items = new Object[size];
	}
	
	public int getNext() {
		return next;
	}
	
	public Object getObj(int i) {
		if(i <= next) {
			return items[i];
		}
		return null;
	}
	
	public void addObject(Object obj) {
		if(next < size) {
			items[next++] = obj;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<next; i++) {
			sb.append("\n" + items[i].toString());
		}
		return sb.toString();
	}
	
	
}
