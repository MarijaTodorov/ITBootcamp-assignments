package p14_05_2021;

public class Kupac {
//	ime i prezime
//	clansku kartu
//	gettere i settere, clanska karta ne moze da se menja
//	konstruktore

	private String imePrezime;
	private ClanskaKarta clanskaKarta1;

	public Kupac(ClanskaKarta k) {
		this.clanskaKarta1 = k;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta1;
	}

	public void stampaj() {
		System.out.println(this.imePrezime + this.clanskaKarta1.getBrKart());
	}

}
