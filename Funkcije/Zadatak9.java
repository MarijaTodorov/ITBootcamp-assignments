package p06_05_2021;

public class Zadatak9 {

	public static void main(String[] args) {
//Napisati metodu koja vrsi konverziju rimske u arapske brojeve
// I =1 ; II =2 ; III = 3; IV =4; V= 5; VI =6; VII =7; VIII = 8; IX = 9; X = 10
//Kao parametar se unosi vrednost rimskog broja a vraca se arapski
// Ako se unese VIII vraca 8

		System.out.println(rBroj("V"));

	}

	public static int rBroj(String aBroj) {
		int a = 0;

		switch (aBroj) {
		case "I":
			a = 1;
			break;

		case "II":
			a = 2;
			break;

		case "III":
			a = 3;
			break;

		case "IV":
			a = 4;
			break;

		case "V":
			a = 5;
			break;

		case "VI":
			a = 6;
			break;

		case "VII":
			a = 7;
			break;

		case "VIII":
			a = 8;
			break;

		case "IX":
			a = 9;
			break;

		case "X":
			a = 10;
			break;
		}

		return a;
	}

}