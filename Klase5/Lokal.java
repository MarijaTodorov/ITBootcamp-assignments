package ProbniTest;

public class Lokal extends Objekat {

	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}

	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina * 1.3;
	}

	@Override
	public void print() {
		System.out.println("Lokal se nalazi na adresi " + this.adresa + " ima povrsinu od " + this.povrsina
				+ " i nalazi se u zoni " + this.zona + ". Porez iznosi: " + this.porez());
	}

}
