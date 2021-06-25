package Domaci06_05;

public class Zadatak3_ZaVezbanje {

	public static void main(String[] args) {
//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//Primer izvrsenja: 
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//Napomena: Resiti bez koriscenja petlji. 

		int x = br(-8, -1);

		System.out.println("Rezultat je " + x);

	}

	public static int br(int m, int n) {

		int a = (n - 1) - m;

		return a;
	}

}
