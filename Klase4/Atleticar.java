package VezbaDomaci;

public abstract class Atleticar {
//	Zadatak 1. Kreirati apstraktnu klasu Atleticar čiji su tributi: 
//		•	ime i prezime privatni
//		•	i rezultat ostvaren na takmičenju koji je zasticen
//		Javne metode klase su: 
//		•	apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara
//		(metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//		•	metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
	
	private String imePrezime;
	protected double rezultat;
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public double getRezultat() {
		return rezultat;
	}
	public void setRezultat(double rezultat) {
		this.rezultat = rezultat;
	}
	public Atleticar(String imePrezime, double rezultat) {
		super();
		this.imePrezime = imePrezime;
		this.rezultat = rezultat;
	}
	
	public abstract boolean koJeBolji(Atleticar best);
	
	public void print() {
		System.out.println(this.imePrezime);
	}

}
