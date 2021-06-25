package p06_05_2021;

public class Zadatak10 {

	public static void main(String[] args) {
//Napisati metodu koja vri spajanje punog imena.
//Ulazni parametri su:	ime	prezime	ime oca
//Metoda vraca ime u formatu [ime], [ime oca] [prezime]
//Za parametre Petar, Jovan, Jovanovic vraca se Milan, Nebojsa Jovanovic.

		String x = imeIprezime("Petar", "Jovan", "Jovanovic");
		System.out.println(x);

	}

	public static String imeIprezime(String ime, String imeOca, String prezime) {
		String a = ime + ", " + imeOca + " " + prezime;

		return a;

	}

}
