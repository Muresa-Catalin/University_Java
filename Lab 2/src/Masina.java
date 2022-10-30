
public class Masina {
	
	public String culoare;
	public Integer putere_cp;
	public String marca;
	private Integer an_fabricatie;

	public void porneste() {
		System.out.println("masina de culoare " + culoare + " si marca "  + marca + " porneste\n");
	}
	
	public void opreste() {
		System.out.println("masina oprita!\n");
	}
	
	Masina(String c, Integer cp, String m, Integer anf){
		culoare = c;
		putere_cp = cp;
		marca = m;
		an_fabricatie = anf;
	}

}
