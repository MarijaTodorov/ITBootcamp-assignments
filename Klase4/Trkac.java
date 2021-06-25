package VezbaDomaci;

public class Trkac extends Atleticar {
	// Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je
	// bolji manji rezultat, a kod skakača veći.
	public Trkac(String imePrezime, double rezultat) {
		super(imePrezime, rezultat);

	}

	@Override
	public boolean koJeBolji(Atleticar best) {
		return this.rezultat < best.rezultat;
	}
}
