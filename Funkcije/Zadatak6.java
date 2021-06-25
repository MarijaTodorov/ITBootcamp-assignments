package p06_05_2021;

public class Zadatak6 {

	public static void main(String[] args) {
//Napisati metodu koja ispisuje da li je moguce prebacivanje sredstva sa jednog racuna na drugi. Od parametara se unosi:
//broj racuna sa kog se salju sredstva
//broj racuna na koji se salju sredstva
//Stanje na racunu sa kog se salje
//Iznos
//Za prebacivanje sredstva se uracunava provizija od 5%.Ukoliko ima dovoljno sredstava odstapati “Transakcija je moguca” u suprotnom “Transakcija nije moguca”.
//Primer poziva:
//Ako se unese 840-23923-23, 840-32923-232, stanje 100, iznos 20. Transakcije je moguca
//Ako se unese 840-23923-23, 840-32923-232, stanje 100, iznos 100. Transakcije nije moguca. Objasnjenje: Jer sa provizijom ispada 105!

		prebacivanje(" 840-23923-23 ", " 840-32923-232 ", 100, 20);
		prebacivanje(" 840-23923-23 ", " 840-32923-232 ", 100, 100);
		prebacivanje(" 840-23923-23 ", " 840-32923-232 ", 100, 96);
		prebacivanje(" 840-23923-23 ", " 840-32923-232 ", 100, 50);

	}

	public static void prebacivanje(String brRacuna1, String brRacuna2, double stanje, double iznos) {
		iznos = iznos + (iznos * 0.05);
		if (stanje <= iznos) {
			System.out.println("Transakcija nije moguca");
		} else {
			System.out.println("Transakcija je moguca");
		}
	}

}
