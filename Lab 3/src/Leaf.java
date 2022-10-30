public class Leaf { // clasa Leaf
	int i = 0; // atribut in clasa Leaf

	Leaf increment() { // metoda ce returneaza un obiect de tip Leaf
		i++;
		return this; // se returneaza obiectul curent
	}

	void print() { // metoda in clasa Leaf
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf(); // instantiere
		x.increment().increment().increment().print(); // 3 apeluri ale metodei increment
		// fiecare apel al metodei increment schimba valoarea atributlui i si returneaza
		// obiectul cu noua
		// valoare; fiecare apel increment() returneaza un obiect de tip Leaf
	}
}
