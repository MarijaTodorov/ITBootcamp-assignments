package ProbniTest;

import java.util.ArrayList;

public class PoreskaUprava {

	private String grad;
	private ArrayList<Objekat> objekti = new ArrayList<Objekat>();

	public void dodajObjekat(Objekat o) {
		objekti.add(o);
	}
//	metodu koja vraca objekat sa najvecim porezom

	public Objekat najveciPorez() {
		Objekat max = objekti.get(0);
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() > max.porez()) {
				max = this.objekti.get(i);
			}
		}
		return max;
	}

	public Objekat najmanjiPorez() {
		Objekat min = objekti.get(0);
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() < min.porez()) {
				min = this.objekti.get(i);
			}
		}
		return min;

	}

	public double porezGrad() {
		double sum = 0;
		for (int i = 0; i < objekti.size(); i++) {
			sum = sum + objekti.get(i).porez();
		}
		return sum;

	}

//	metodu koja stampa sve objekte
	public void print() {
		for (int i = 0; i < objekti.size(); i++) {
			objekti.get(i).print();
		}
	}
}
