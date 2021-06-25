package Test2;

import java.util.ArrayList;

public class PlaninarskiDom {
//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//		naziv doma 
//		godinu kada je osnovan. 
//		članove doma koji su planinari (klasa vodi računa o nizu) 
//		Dok od javnih: 
//		default-ni konstuktor i konstuktor koji postavlja sve parametre 
//		gettere i settere koji su potrebni 

	private String nazivDoma;
	private int godinaOsnivanja;
	private ArrayList<Planinar> planinari = new ArrayList<Planinar>();

	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public ArrayList<Planinar> getPlaninari() {
		return planinari;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}
//	metodu učlani planinara, koja dodaje planinara u niz 

	public void uclaniPlaninara(Planinar planinar) {
		planinari.add(planinar);
	}

//	metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu 
//	(metoda za parametar prima Planinu za koju se proverava informacija)	
	public int brUspesnihPlaninara(Planina imePlanine) {
		int br = 0;
		for (int i = 0; i < planinari.size(); i++) {
			if (this.planinari.get(i).uspesno(imePlanine)) {
				br = br + 1;
			}
		}
		return br;
	}

//	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
	public void izbacitiPlaninara(int id) {
		for (int i = 0; i < planinari.size(); i++) {
			if (this.planinari.get(i).getId() == id) {
				this.planinari.remove(i);
			}
		}
	}

//	metodu koja štampa podatke o domu i o svim članovima doma
	public void print() {
		System.out.println("Planinarski dom: " + this.nazivDoma);
		System.out.println("Osnovan: " + this.godinaOsnivanja + "god");
		System.out.println("Clanovi planinarskog doma: ");
		for (int i = 0; i < planinari.size(); i++) {
			this.planinari.get(i).print();
		}
	}

//	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
	public double mesecniPrihod() {
		double prihod = 0;
		for (int i = 0; i < planinari.size(); i++) {
			prihod = prihod + this.planinari.get(i).clanarina();
		}
		return prihod;
	}

}
