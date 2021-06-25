package ProbniTest;

public abstract class Objekat {

	protected String adresa;
	protected double povrsina;
	protected int zona;

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public Objekat(String adresa, double povrsina, int zona) {
		super();
		this.adresa = adresa;
		this.povrsina = povrsina;
		this.zona = zona;
	}

	public double koeficijent() {
		double koef = 0;
		if (this.zona == 1) {
			koef = 1.4;
		} else if (this.zona == 2) {
			koef = 1.1;
		} else if (this.zona == 3) {
			koef = 1.05;
		}
		return koef;
	}

	public abstract double porez();

	public abstract void print();

}
