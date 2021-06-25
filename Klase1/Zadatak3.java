package p14_05_2021;

public class Zadatak3 {

	public static void main(String[] args) {

		ClanskaKarta clanskaKarta1 = new ClanskaKarta(10, "35882");

		Kupac kupac1 = new Kupac(clanskaKarta1);
		kupac1.setImePrezime("Marija Todorovic");

		Proizvod proizvod1 = new Proizvod();
		proizvod1.setNaziv("Patike");
		proizvod1.setCenaIzrade(10000);
		proizvod1.setKupac1(kupac1);

		proizvod1.stampaj();

	}

}
