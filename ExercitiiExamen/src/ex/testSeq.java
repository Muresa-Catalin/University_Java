package ex;

public class testSeq {

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		
		sequence.addObject("primul obj");
		sequence.addObject("al 2 lea obj");
		sequence.addObject(5);
		sequence.addObject(3.14);
		
		//System.out.println(sequence);
		
		/*for(int i = 0; i<sequence.getNext(); i++) {
			System.out.println(sequence.getObj(i));
		}*/
		
		while(!sequence.end()) {
			Object object = sequence.current();
			System.out.println(object);
			sequence.next();
		}
	}

}
