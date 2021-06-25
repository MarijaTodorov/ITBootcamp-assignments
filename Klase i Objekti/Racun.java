package p11_05_2021;

public class Racun {

	public String brojRacuna;
	public String imePrezime;
	public int stanjeRacuna;

	public void stampajRacun() {
		System.out.println("Ime i prezime: " + this.imePrezime);
		System.out.println("Broj: " + this.brojRacuna);
		System.out.println("Stanje: " + this.stanjeRacuna);
	}

}
