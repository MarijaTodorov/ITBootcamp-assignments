package p11_05_2021;

public class KlasaAuto {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		auto1.imePrezime = "Ime1 Prezime1";
		auto1.markaAutomobila = "BMW";
		auto1.brojVrata = 5;
		auto1.potrosnja = 10;
		auto1.brzina = 200;
		auto1.brReg = "BG 123 - AB";
		auto1.ukljucenKlima = false;

		auto1.stampaj();

		auto1.dodajGas();
		auto1.dodajGas();
		auto1.dodajGas();
		auto1.koci();

		double p = auto1.potrosnja();
		System.out.println("Postrosnja je " + p);

		System.out.println(auto1.prekoracenje(120));
		if (auto1.prekoracenje(120)) {
			System.out.println("Kazna je " + auto1.kazna(120));
		} else {
			System.out.println("Nema kazne");
		}

	}
}
