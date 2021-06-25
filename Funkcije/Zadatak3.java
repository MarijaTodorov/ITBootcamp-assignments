package p06_05_2021;

public class Zadatak3 {

	public static void main(String[] args) {
//Napisati metodu koja stampa sve pozitivne broje do N. N je parametar metode.
//	stampajPozitvne => 10 
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10

		stampajPozitivne(10);

	}

	public static void stampajPozitivne(int x) {
		for (int i = 1; i < x; i++) {

			System.out.print(i + ", ");

		}
	}
}
