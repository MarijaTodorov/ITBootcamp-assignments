package Domaci14_05;

public class Zadatak1 {

	public static void main(String[] args) {

		Autor pisac = new Autor("Dmitry", "Glukhovsky");
		Knjiga knjiga1 = new Knjiga(1234567, "Metro 2033", 2002);
		knjiga1.setAutor(pisac);
		knjiga1.stampaj();

		Autor pisac2 = new Autor("Sergey", "Lukyanenko");
		Knjiga knjiga2 = new Knjiga(7654321, "Night Watch", 1998);
		knjiga2.setAutor(pisac2);
		knjiga2.stampaj();

		Autor pisac3 = new Autor("John", "Steinbeck");
		Knjiga knjiga3 = new Knjiga(3459876, "Of Mice and Men", 1937);
		knjiga3.setAutor(pisac3);
		knjiga3.stampaj();

	}

}
