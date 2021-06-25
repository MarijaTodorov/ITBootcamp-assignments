package p06_05_2021;

public class Zadatak11 {

	public static void main(String[] args) {
//Napisati metodu koja vrsi konverziju metre u cm,dm,m
//Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju
//1 m = 100cm		1m = 10dm	1m = 0.001km
//Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5

		double a = vrednost(1500, "km");
		System.out.println(a);

	}

	public static double vrednost(double br, String mera) {
		double x = 0;

		if (mera.equals("cm")) {
			x = br * 100;
		} else if (mera.equals("dm")) {
			x = br * 10;
		} else if (mera.equals("km")) {
			x = br / 1000;
		}

		return x;
	}

}
