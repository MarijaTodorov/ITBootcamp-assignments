package p11_05_2021;

public class Auto {

	public String imePrezime;
	public String markaAutomobila;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	public String brReg;
	public boolean ukljucenKlima;

	public void stampaj() {

		System.out.println(this.imePrezime);
		System.out.println(this.markaAutomobila + " " + this.brojVrata + "oro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l i na 100km");
		System.out.println("Trenutna brzina auta je " + this.brzina + "km/h");
		System.out.println(this.brReg);

	}

	public boolean prekoracenje(int ogranicenje) {
		return this.brzina > ogranicenje;

	}

	public int kazna(int ogranicenje) {
		return (this.brzina - ogranicenje) * 1000;
	}

	public void dodajGas() {
		this.brzina = this.brzina + 10;

	}

	public void koci() {
		this.brzina = this.brzina - 10;
		if (this.brzina < 0) {
			this.brzina = 0;
		}
	}
	// metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//	faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//	(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

	public double potrosnja() {
		double fk = 1.0;

		if (this.ukljucenKlima) {
			fk = 1.2;
		}

		return this.brzina / 100.0 * this.potrosnja * fk;

	}

}
