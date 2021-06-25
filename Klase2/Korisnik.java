package p17_05;

public class Korisnik {

// ime i prezime
// tip licence (basic/pro/premium)
	private String imePrezime, tipLicence;

//gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja

	public String getImePrezime() {
		return this.imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTipLicence() {
		return this.tipLicence;
	}

//konstruktore
	public Korisnik(String imePrezime) {
		this.imePrezime = imePrezime;
		this.tipLicence = "basic";
	}

	public Korisnik() {
		this.tipLicence = "basic";
	}
//	metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//		ako je uplata 100, postavlja licencu na “pro”
//		ako je uplata 150, postavlja licencu na “premium”

	public void subscribe(int placanje) {
		switch (placanje) {
		case 100:
			this.tipLicence = "pro";
			break;
		case 150:
			this.tipLicence = "premium";
		}
	}

//	metodu ponisti pretplatu koja postavlja licencu na basic
	public void ponistiPretplatu() {
		this.tipLicence = "basic";
	}
//	metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//	ako je basic, vraca 40min
//	ako je pro, vraca 240min
//	ako je  premium, vraca 1440min

	public int callDuration() {
		int duzina = 0;
		if (this.tipLicence.equals("basic")) {
			duzina = 40;
		} else if (this.tipLicence.equals("pro")) {
			duzina = 240;
		} else if (this.tipLicence.equals("premium")) {
			duzina = 1440;
		}
		return duzina;

	}
//	metodu za stampu koja stampa u formatu:
//		ime i prezime

	public void print() {
		System.out.println(this.imePrezime);
	}

}
