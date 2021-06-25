package p17_05;

public class ZoomCall {

//	link za poziv
//	password
//	korisnika koji je host
//	korisnika koji je guest
//	gettere za sve atribute
//	setter samo za guest-a
//	metodu pokreni poziv koja stampa podatke u formatu:
//			Zoom Call: url
//			Password: password
//			Host: ime i prezime
//			Guest: ime i prezime
//			Maksimalno trajanje poziva je (broj minuta)min
//			
//			Maksimalno trajanje poziva se cita od korisnika koji je host!

	private String link, password;
	private Korisnik guest, host;

	public ZoomCall(String link, String password, Korisnik host) {
		this.link = link;
		this.password = password;
		this.host = host;

	}

	public String getLink() {
		return this.link;
	}

	public String getPassword() {
		return this.password;
	}

	public Korisnik getHost() {
		return host;
	}

	public Korisnik getGuest() {
		return this.guest;
	}

	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
//	metodu pokreni poziv koja stampa podatke u formatu:
//		Zoom Call: url
//		Password: password
//		Host: ime i prezime
//		Guest: ime i prezime
//		Maksimalno trajanje poziva je (broj minuta)min

	public void stampaj() {
		System.out.println("Zoom Call: " + this.link);
		System.out.println("Password: " + this.password);
		System.out.println("Host: " + this.getHost().getImePrezime());
		System.out.println("Guest: " + this.getGuest().getImePrezime());
		System.out.println("Maksimalno trajanje poziva je: " + this.getHost().callDuration() + "min");
	}

}
