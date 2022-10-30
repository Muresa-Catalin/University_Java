public class StringOperators {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		
		System.out.println(s + x + y + z);
		System.out.print(x + " " + s); // conversie implicita a valorii x de la tipul int la String
		s += "(summed) = "; // echivalent cu s=s+"(summed)="
		
		System.out.println(s + (x + y + z));
		System.out.print("" + x); // Shorthand for Integer.toString()-metoda de conversie a int->String
	}
} 
