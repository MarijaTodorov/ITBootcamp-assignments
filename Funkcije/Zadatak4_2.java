package p06_05_2021;

public class Zadatak4_2 {

	public static void main(String[] args) {
		// napisati metodu koja stamoa podatke o koristniku u formatu:
		// JMBG: [JMBG]; IME: [ime]; PREZIME [prezime]; God.rodjenja [god]; AKTIVAN
		// [true/false]

		podaci("123456789", "Marija", "Todorovic", 1988, true);

	}

	public static void podaci(String jmbg, String ime, String prezime, int god, boolean aktivan) {
		System.out.println("JMBG: " + jmbg + " Ime: " + ime + " Prezime " + prezime + " Godina rodjenja: " + god
				+ " Aktivan " + aktivan);

	}

}
