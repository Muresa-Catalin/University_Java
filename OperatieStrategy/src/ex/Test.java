package ex;

public class Test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		float x = 5;
		float y = 10;
		
		calculator.calcul(x, y, new OperatieInmultire());

	}

}
