package p11_05_2021;

public class GlavnaKlasa2 {

	public static void main(String[] args) {

//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima.
//		I ispisati na ekranu ko ima vise sredstava na racunu. (Provera preko if-a)

//		Zatim kreirati metodu za stampanje racuna, metoda prima kao parametre
//		broj racuna, ime i prezime vlasnika i stanje na racunu.

		Racun vlasnik1 = new Racun();
		vlasnik1.brojRacuna = "840-12932-323";
		vlasnik1.imePrezime = "Ime1 Prezime1";
		vlasnik1.stanjeRacuna = 1000;

		Racun vlasnik2 = new Racun();
		vlasnik2.brojRacuna = "840-12345-654";
		vlasnik2.imePrezime = "Ime2 Prezime2";
		vlasnik2.stanjeRacuna = 2000;

		if (vlasnik1.stanjeRacuna > vlasnik2.stanjeRacuna) {
			stampaj(vlasnik1.imePrezime, vlasnik1.brojRacuna, vlasnik1.stanjeRacuna);
		} else {
			stampaj(vlasnik2.imePrezime, vlasnik2.brojRacuna, vlasnik2.stanjeRacuna);
		}

	}

	public static void stampaj(String imePrezime, String brojRacuna, int stanjeRacuna) {

		System.out.println("Ime i Prezime: " + imePrezime);
		System.out.println("Broj racuna je: " + brojRacuna);
		System.out.println("Stanje na racunu je " + stanjeRacuna);
	}
}
