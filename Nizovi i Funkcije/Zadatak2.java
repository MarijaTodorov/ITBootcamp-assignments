package p07_05_2021;

public class Zadatak2 {

	public static void main(String[] args) {
//Napisati metodu koja vraca informaciju da li je broj N veci od broja K. N i K su parametri metode, a metoda vraca true ili false.
//Ako se pozove za N = 5 i K = 2, vraca true
//Ako se pozove za N = 2 i K = 3, vraca false

		boolean a = veceManje(5, 2);
		System.out.println(a);

	}

	public static boolean veceManje(int n, int k) {
		boolean x;

		if (n < k) {
			x = false;
		} else {
			x = true;
		}
		return x;

	}
}
