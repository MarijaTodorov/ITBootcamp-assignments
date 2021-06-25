package p17_05;

public class Zadatak1 {

	public static void main(String[] args) {

		Korisnik korisnik = new Korisnik("Jovan Jovanovic");
		korisnik.subscribe(100);
		korisnik.ponistiPretplatu();
		korisnik.callDuration();
		korisnik.print();
		Korisnik guest1 = new Korisnik("Petar Petrovic");

		ZoomCall zoomcall = new ZoomCall("https://blabla.com", "blahblah", korisnik);
		zoomcall.setGuest(guest1);

		zoomcall.stampaj();

	}

}
