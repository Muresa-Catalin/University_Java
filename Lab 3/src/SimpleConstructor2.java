class Rock2{
	Rock2(int i){
		System.out.println("Rock " + i + "");
	}
}

public class SimpleConstructor2 {

	public static void main(String[] args) {
		Rock2 obj;
		for(int i = 0; i<8; i++) {
			obj = new Rock2(i);
		}

	}

}
