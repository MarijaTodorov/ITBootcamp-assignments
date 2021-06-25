package VezbaDomaci;

public class MainDiscipline {

	public static void main(String[] args) {
//		U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika, 
//		učitati podatke o učesnicima obe discipline sa tastature i na ekranu prikazati poruke o pobednicima obe discipline. 
		
		Discipline skakaci = new Discipline("Skok u dalj", "sa odrazom");
		Discipline trkaci = new Discipline("100m sa preponama", "nesto");
		
		Atleticar trkac1 = new Trkac("Jovan Jovanovic", 15.4);
		Atleticar trkac2 = new Trkac("Petar Petrovic", 10.4);
		Atleticar trkac3 = new Trkac("Milan Milanovic", 15.0);
		
		Atleticar skakac1 = new Skakac("Mara Maric",8);
		Atleticar skakac2 = new Skakac("Jova Jovic",10);
		Atleticar skakac3 = new Skakac("Misa Misic",9);
		
		skakaci.dodajAtleticara(skakac1);
		skakaci.dodajAtleticara(skakac2);
		skakaci.dodajAtleticara(skakac3);
		
		trkaci.dodajAtleticara(trkac3);
		trkaci.dodajAtleticara(trkac2);
		trkaci.dodajAtleticara(trkac1);
		
		skakaci.diskvalifikuj("Petar Petrovic");
		trkaci.diskvalifikuj("Misa Misic");
		
		skakaci.print();
		trkaci.print();
		
		
	}

}
