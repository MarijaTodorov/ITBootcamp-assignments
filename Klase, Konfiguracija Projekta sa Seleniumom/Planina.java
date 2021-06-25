package Test2;

public class Planina {
//	(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//		ime planine 
//		naziv države u kojoj se nalazi 
//		visinu planine. 
//		a od javnih metoda: 
//		default-ni konstruktor i konstuktor koji postavlja sve parametre 
//		gettere i settere za sve atribute 

	private String Planina;
	private String drzava;
	private double visinaPlanine;

	public Planina(String planina, String drzava, double visinaPlanine) {
		Planina = planina;
		this.drzava = drzava;
		this.visinaPlanine = visinaPlanine;
	}

	public Planina() {

	}

	public String getPlanina() {
		return Planina;
	}

	public void setPlanina(String planina) {
		Planina = planina;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}

}
