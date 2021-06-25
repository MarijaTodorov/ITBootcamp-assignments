package ProbniTest;

public class Kuca extends Objekat {

	private int brClanova;

	public Kuca(String adresa, double povrsina, int zona, int brClanova) {
		super(adresa, povrsina, zona);
		this.brClanova = brClanova;
	}

	public int getBrClanova() {
		return brClanova;
	}

	public void setBrClanova(int brClanova) {
		this.brClanova = brClanova;
	}

	@Override
	public double porez() {
		return this.povrsina * this.koeficijent();
	}

	@Override
	public void print() {
		System.out.println("Kuca na adresi " + this.adresa + " sa povrsinom od " + this.povrsina
				+ "kv, se nalazi u zoni " + this.zona + ", porez iznosi: " + this.porez()
				+ ". Broj clanova domacinstva je: " + this.brClanova);

	}

}
