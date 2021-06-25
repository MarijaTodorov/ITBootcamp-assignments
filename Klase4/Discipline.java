package VezbaDomaci;

import java.util.ArrayList;

public class Discipline {
//Kreirati i klasu Disciplina čiji su privatni atributi: 
//	•	ime discipline
//	•	tip discipline (Trkacka ili Skakacka)
//	•	niz atletičara koji učestvuju u toj disciplini. 

	private String imeDiscipline;
	private String tipDiscipline;
	private ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}

	public ArrayList<Atleticar> getAtleticari() {
		return atleticari;
	}

	public void setAtleticari(ArrayList<Atleticar> atleticari) {
		this.atleticari = atleticari;
	}

	public Discipline(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public void dodajAtleticara(Atleticar atleticar) {
		atleticari.add(atleticar);
	}

	public void diskvalifikuj(String imePrezime) {
		for (int i = 0; i < atleticari.size(); i++) {
			if (this.atleticari.get(i).getImePrezime().equals(imePrezime)) {
				this.atleticari.remove(i);
			}
		}
	}

	private Atleticar najbolji() {
		Atleticar najbolji = this.atleticari.get(0);
		for (int i = 1; i < atleticari.size(); i++) {
			if (this.atleticari.get(i).koJeBolji(najbolji)) {
				najbolji = this.atleticari.get(i);
			}
		}
		return najbolji;

	}

	public void print() {
		Atleticar best = this.najbolji();
		best.print();
	}
//	U javnom delu klase definisati: 
//		•	konstuktore, gettere i settere
//		•	konstruktor koji postavlja ime discipline i tip
//		•	metodu dodaj atleticara u disciplinu
//		•	metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//		•	privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//		•	metoda koja prikazuje podatke o pobedniku discipline. 

}
