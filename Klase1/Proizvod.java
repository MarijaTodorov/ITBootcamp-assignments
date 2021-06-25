package p14_05_2021;

public class Proizvod {
//	Kreirati klasu Proizvod koja ima
//	Naziv proizvoda
//	kupca/musteriju
//	cenu izrade proizvoda
//	gettere i settere
//	konstruktore

	private String naziv;
	private double cenaIzrade;
	private Kupac kupac1;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCenaIzrade() {
		return cenaIzrade;
	}

	public void setCenaIzrade(double cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}

	public Kupac getKupac() {
		return kupac1;
	}

	public void setKupac1(Kupac kupac1) {
		this.kupac1 = kupac1;
	}

	public double racunajCenu() {
		return this.cenaIzrade * 1.9 * (100 - this.kupac1.getClanskaKarta().getPopust()) / 100;
	}

	public void stampaj() {
		System.out.println(this.naziv + " - " + this.racunajCenu());
		this.kupac1.stampaj();
	}

}
