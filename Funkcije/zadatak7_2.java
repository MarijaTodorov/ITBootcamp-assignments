package p06_05_2021;

public class zadatak7_2 {

	public static void main(String[] args) {
		// Napisati metodu koja vraca kurs dinara za razlicite valute. Kao parametar se
		// unosi oznaka valute:
		// Za EUR vraca 118.5
		// Za AUD vraca 75.68
		// Za CAD vraca 79.32

		double a = kurs("cad");
		System.out.println(a);

	}

	public static double kurs(String valuta) {
		double x = 0;

		switch (valuta) {

		case "eur":
			x = 118.5;
			break;
		case "aud":
			x = 75.68;
			break;
		case "cad":
			x = 79.32;
			break;

		}
		return x;

	}

}