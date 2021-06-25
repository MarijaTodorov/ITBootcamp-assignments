package ProbniTest;

public class Zgrada extends Objekat {

	private int brStanova;

	public Zgrada(String adresa, double povrsina, int zona, int brStanova) {
		super(adresa, povrsina, zona);
		this.brStanova = brStanova;
	}

	public int getBrStanova() {
		return brStanova;
	}

	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}

	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina * this.brStanova;
	}

	@Override
	public void print() {
		System.out.println("Stambena zgrada na adresi: " + this.adresa + " ima povrsinu od " + this.povrsina
				+ " i nalazi se u zoni " + this.zona + ". Porez iznosi: " + this.porez() + ". Broj stanova u zgradi je "
				+ this.brStanova);

	}

}
