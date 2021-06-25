package p07_05_2021;

public class Zadatak5 {

	public static void main(String[] args) {
//Napisati metodu koja stampa indekse elemenata iz niza na kojima se nalazi vrednost K. Kao parametri se primaju niz i K.
//Ako se prosledi niz = {1, 2, 3, 43, 45, 54, 1, 2} i K= 1, stampaju se 0, 6.

		int[] niz = { 1, 2, 3, 43, 45, 54, 1, 2 };

		elementi(niz, 1);

	}

	public static void elementi(int[] niz, int k) {

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == k) {
				System.out.print(i + ", ");
			}

		}
	}

}
