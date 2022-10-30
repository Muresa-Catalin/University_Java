import java.util.*;

public class Problema6 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int v[] = new int[25];
		
		for(int i = 0; i < 25; i++)
			 v[i] = rand.nextInt(0, 100);
		
		for(int i = 0; i<24; i++) {
			if(v[i] < v[i+1]) {
				System.out.println(v[i] + " < " + v[i+1] + "  mai mic");
			}else {
				System.out.println(v[i] + " > " + v[i+1] + "  mai mare");
			}
		}
	}
}
