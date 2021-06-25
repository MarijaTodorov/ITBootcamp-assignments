package Domaci06_05;

public class Zadatak4_ZaVezbanje {

	public static void main(String[] args) {
//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		int x = najmanjiBroj(5, 2, 6);
		System.out.println("Najmanji od tri broja je " + x);

	}

	public static int najmanjiBroj(int a, int b, int c) {

		int min = a;

		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		return min;
	}

}
