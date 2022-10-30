
public class TestMasina {

	public static void main(String[] args) {
		Masina m = new Masina("verde", 100, "Ford", 2009);
		
		m.porneste();
		m.opreste();
		
		Masina m1 = new Masina("albastru", 110, "Citroen", 2021);
		
		m1.porneste();

	}

}
