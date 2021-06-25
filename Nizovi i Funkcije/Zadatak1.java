package p07_05_2021;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati metodu koja racuna K-ti stepen broja N. K i N su parametri funkcije.
		// Ako se metoda pozove za N = 10, i K = 4 vraca 10000.

		int x = stepen(10, 4);
		System.out.println(x);

	}

	public static int stepen(int n, int k) {
		int a = 1;

		for (int i = 1; i <= k; i++) {
			a = a * n;
		}

		return a;

	}
}
