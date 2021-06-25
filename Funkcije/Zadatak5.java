package p06_05_2021;

public class Zadatak5 {

	public static void main(String[] args) {
//Napisati metodu koja stampa sve brojeve izmeju M i N. M i N su parametri metode.
//Ako se za M unese 2 a za N 6, stampa se:
//2, 3, 4, 5, 6

		OdDo(2, 6);

	}

	public static void OdDo(int m, int n) {

		for (int i = m; i <= n; i++) {
			System.out.print(i + ", ");
		}
	}

}
