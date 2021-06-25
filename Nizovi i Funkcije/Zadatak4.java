package p07_05_2021;

public class Zadatak4 {

	public static void main(String[] args) {
//Napisati metodu koja stampa samo parne elemnte iz niza. Kao parametar se salje niz za kopiranje.

		int[] niz = new int[9];
		niz[0] = 1;
		niz[1] = 2;
		niz[2] = 3;
		niz[3] = 4;
		niz[4] = 5;
		niz[5] = 6;
		niz[6] = 7;
		niz[7] = 8;
		niz[8] = 9;

		random(niz);

	}

	public static void random(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				System.out.print(niz[i] + ", ");
			}
		}

	}
}
