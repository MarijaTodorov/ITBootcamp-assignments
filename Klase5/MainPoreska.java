package ProbniTest;

public class MainPoreska {

	public static void main(String[] args) {
//U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.

		PoreskaUprava pu = new PoreskaUprava();

		Objekat kuca = new Kuca("Ljeska", 65, 1, 3);

		Objekat zgrada = new Zgrada("Ace Joksimovica", 55, 2, 10);

		Objekat lokal = new Lokal("Marsala Tolbuhina", 40, 1);

		pu.dodajObjekat(kuca);
		pu.dodajObjekat(zgrada);
		pu.dodajObjekat(lokal);
		pu.print();

		Objekat objekatSaNajvecimPorezom = pu.najveciPorez();
		System.out.print("Najveci porez je ");
		objekatSaNajvecimPorezom.print();

		double grad = pu.porezGrad();
		System.out.println("Porez u gradu Beogradu iznosi: " + grad);

	}

}
