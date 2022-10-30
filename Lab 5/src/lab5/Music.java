package lab5;

//fisier Note.java
enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}

//fisier Instrument.java
class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}

//fisier Wind.java
//obiectele Wind sunt instrumente pentru ca au aceeasi interfata
class Wind extends Instrument { // redefinim metoda din interfata:
	public void play(Note n) { // metoda play() este suprascrisa
		System.out.println("Wind.play() " + n);
	}
}

//fisier Music.java
public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind(); // obiectul flute este in acelasi timp si de tipul Instrument
//functia tune() asteapta un argument de tip Instrument dar accepta si obiecte de tip Wind
		tune(flute); // Upcast– se va executa metoda play() din clasa Wind
	}
}
