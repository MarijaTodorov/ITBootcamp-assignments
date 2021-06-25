package p06_05_2021;

public class Zadatak2 {

	public static void main(String[] args) {
//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost prosledjene vrednosti

		stampajApsolutnuVrednost(4);
		stampajApsolutnuVrednost(-8);

	}

	public static void stampajApsolutnuVrednost(int x) {
		if (x < 0) {
			System.out.println(-x);
		} else {
			System.out.println(x);
		}
	}
}