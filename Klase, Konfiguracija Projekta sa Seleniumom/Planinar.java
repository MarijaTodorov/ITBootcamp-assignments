package Test2;

public abstract class Planinar {
//	(15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//		jedinstveni celobrojni identifikacioni broj
//		ime i prezime 
//		Dok od javnih metoda: 
//		konstruktor koji postavlja sve atribute klase. 
//		gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. 
//		posle njihovog postavljanja u konstruktoru)
//		apstraktnu metodu štampaj
//		apstraktnu metodu koja vraca clanarinu planinara
//		apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. 
//		Metoda kao ulazni parametar prima objekat tipa Planina. 
	protected int id;
	protected String imePrezime;

	public Planinar(int id, String imePrezime) {
		super();
		this.id = id;
		this.imePrezime = imePrezime;
	}

	public int getId() {
		return id;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public abstract void print();

	public abstract double clanarina();

	public abstract boolean uspesno(Planina planina);

}
