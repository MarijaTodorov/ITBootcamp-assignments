package p06_05_2021;

public class Zadatak7 {

	public static void main(String[] args) {
//Napisati metodu koja vraca kurs dinara za razlicite valute. Kao parametar se unosi oznaka valute:
//Za EUR vraca 118.5
//Za AUD vraca 75.68
//Za CAD vraca 79.32

		double a = kurs("eur");
		System.out.println(a);

	}

	public static double kurs(String valuta) {
		double x = 0;

		if (valuta.equals("eur")) {
			x = 118.5;
		} else if (valuta.equals("aud")) {
			x = 75.68;
		} else if (valuta.equals("cad")) {
			x = 79.32;
		}
		return x;

	}

}
