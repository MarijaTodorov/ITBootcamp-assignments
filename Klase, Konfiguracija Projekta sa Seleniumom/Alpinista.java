package Test2;

public class Alpinista extends Planinar {
//	(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
//	Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. 

	private int poeni;

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	public Alpinista(int id, String imePrezime, int poeni) {
		super(id, imePrezime);
		this.poeni = poeni;
	}

//	a informacije o alpinisti se ispisuju u formatu: 
//	Alpinista, id: (id) ime: (ime i prezime) Broj poena: (poeni)
	@Override
	public void print() {
		System.out.println("Alpinista, id: " + this.id + " ime: " + this.imePrezime + " Broj poena: " + this.poeni);

	}

//	 placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
	@Override
	public double clanarina() {
		return 1500 - 50 * this.poeni;
	}

//	Alpinista može da savlada sve uspone do 4000 metara,
	@Override
	public boolean uspesno(Planina planina) {
		return planina.getVisinaPlanine() <= 4000;
	}

}
