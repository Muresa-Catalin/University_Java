import java.util.Scanner;

public class Problema7 {
	static int n;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int a = 0, b = 1, c =1;
			
		while(c <= n) {
			System.out.print(c + " ");
			c = a+b;
			a = b;
			b = c;
		}
	}
}
