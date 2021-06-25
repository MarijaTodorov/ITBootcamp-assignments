package p06_05_2021;

public class Zadatak1 {

	public static void main(String[] args) {
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		stampajVrednostZa10Vecu(10);
		stampajVrednostZa10Vecu(122);
		stampajVrednostZa10Vecu(-1);

	}

	public static void stampajVrednostZa10Vecu(int a) {
		int za10veci = a + 10;
		System.out.println(za10veci);

	}

}
