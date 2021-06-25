package p07_05_2021;

public class Zadatak6 {

	public static void main(String[] args) {
//Napisti metodu koja stampa slack poruku sa reakcijama. Kao parametri se primaju:
//Ime korisnika
//Prezime korisnika
//Tekst poruke
//Niz rekacija, npr reakcije = {“lol”, “sunglasses”, “like”, “heart”};
//Za svaku rekaciju broj ponavljanja. npr: ponavljanja = {1, 2, 0, 4}
//Primer stampe:
//Milan Jovanovic
//Srecno na testu!
//lol (1) | sunglasses (2) | like (0) | heart (4)
		String[] smajli = { "lol", "sunglasses", "like", "heart" };
		int[] ponavljanja = { 1, 2, 0, 4 };
		slack("Marija", "Todorovic", "Walking on sunchine", smajli, ponavljanja);

	}

	public static void slack(String ime, String prezime, String txt, String[] smajli, int[] ponavljanja) {
		System.out.println(ime + " " + prezime);
		System.out.println(txt);

		for (int i = 0; i < smajli.length; i++) {
			System.out.print(smajli[i] + "(" + ponavljanja[i] + ")" + " | ");

		}
	}

}
