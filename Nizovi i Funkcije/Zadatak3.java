package p07_05_2021;

public class Zadatak3 {

	public static void main(String[] args) {

//Napisati metodu koja vraca informaciju da li je trazeni korisnik pogledao stori. Kao parametri se unose:
//Niz korisnika koji su videli stori
//Korisnik za koga trazimo inforamciju
//Metoda vraca true ili false
//Ako se pozove za niz = {“Milan Jovanovic”, “Nikola Nikolic”, “Pera Peric”} i trazeni korisnika “Milan Jovanovic” vraca true.
//Ako se pozove za niz = {“Milan Jovanovic”, “Nikola Nikolic”, “Pera Peric”} i trazeni korisnika “Zarko Zarkovic” vraca false.

		String[] niz = { "Milan Jovanovic", "Nikola Nikolic", "Pera Peric" };

		stori(niz, "Zarko Zarkovic");

	}

	public static void stori(String[] niz, String korisnik) {
		boolean x = false;

		for (int i = 0; i < niz.length; i++) {
			if (korisnik.equals(niz[i])) {
				x = true;
			}

		}
		System.out.println(x);
	}

}
