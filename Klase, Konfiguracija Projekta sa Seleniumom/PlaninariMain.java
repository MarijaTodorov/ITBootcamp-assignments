package Test2;

public class PlaninariMain {

	public static void main(String[] args) {
//		(10 poena) U glavnom programu kreirati jedan planinarski dom,
//		i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), 
//		i istestirati svaku od metoda. 
		Planina pl1 = new Planina("Stara planina", "Srbija", 2376);

		PlaninarskiDom pd = new PlaninarskiDom("Midzor", 1970);

		Planinar rp1 = new RekreativniPlaninar(55, "Jovan Jovanovic", 20, "Okrug1", 1500);
		Planinar rp2 = new RekreativniPlaninar(44, "Petar Petrovic", 40, "Okrug2", 2000);
		Planinar rp3 = new RekreativniPlaninar(88, "Nikola Nikolic", 35, "Okrug3", 1800);

		Planinar a1 = new Alpinista(33, "Milos Milosevic", 3);
		Planinar a2 = new Alpinista(15, "Pera Peric", 5);
		Planinar a3 = new Alpinista(20, "Marko Markovic", 10);

		pd.uclaniPlaninara(a1);
		pd.uclaniPlaninara(a2);
		pd.uclaniPlaninara(a3);
		pd.uclaniPlaninara(rp3);
		pd.uclaniPlaninara(rp2);
		pd.uclaniPlaninara(rp1);
		pd.izbacitiPlaninara(88);
		pd.print();
		double mesPrihod = pd.mesecniPrihod();
		System.out.println("Mesecni prihod Planinarskog doma iznosi: " + mesPrihod + "rsd");
		int br = pd.brUspesnihPlaninara(pl1);
		System.out.println("Broj uspesnih planinara je: " + br);

	}

}
