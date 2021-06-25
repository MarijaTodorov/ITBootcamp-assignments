package Test2;

public class RekreativniPlaninar extends Planinar {
//	(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. 
//	Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//		težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//		naziv okruga odakle je rekreativni planinar. 
//		maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//		metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//		Rekreativac, id: (id) ime: (ime i prezime) Okrug: (okrug) 

	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksimalniUspon;

	public RekreativniPlaninar(int id, String imePrezime, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
		super(id, imePrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksimalniUspon = maksimalniUspon;
	}

	@Override
	public void print() {
		System.out.println("Rekreativac, ID: " + this.id + " ime: " + this.imePrezime + " Okrug " + this.nazivOkruga);

	}

//	rekeativci placaju clanarinu u iznosu od 1000 rsd
	@Override
	public double clanarina() {
		return 1000;
	}

//	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, 
//	s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
	@Override
	public boolean uspesno(Planina planina) {
		boolean uspeh = false;
		if (this.maksimalniUspon - this.tezinaOpreme * 50 > planina.getVisinaPlanine()) {
			uspeh = true;
		}
		return uspeh;
	}

}
