package produs;

class Produs {
	int Cod, Pret;

	Produs(int cod, int pret) {
		Cod = cod;
		Pret = pret;
	}
}

class Colet {
	Produs produse[] = new Produs[100];
	static int i = 0;

	void AdaugaProduse(int cod, int pret) {
		produse[i] = new Produs(cod, pret);
		i++;
	}
	
	public void stare() {
		
	}

}

class ColetComandat extends Colet {
	public void stare() {
		System.out.println("Colet comandat");
	}
}

class ColetExpediat extends Colet {
	public void stare() {
		System.out.println("Colet expediat");
	}
}

class Comanda {
	int nrComanda;
	
	Comanda(int nrCom){
		nrComanda = nrCom;
	}
	
	public Colet colet = new ColetComandat();

	public void Proceseaza() {
		colet = new ColetExpediat();
	}

	public void AfisareStare() {
		colet.stare();
	}
}

public class Test {

	public static void main(String[] args) {
		
		Comanda comanda = new Comanda(100);
		comanda.colet.AdaugaProduse(300, 25);
		comanda.Proceseaza();
		comanda.AfisareStare();
		
	}

}
