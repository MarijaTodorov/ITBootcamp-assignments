package Domaci14_05;

public class Knjiga {

//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 

	private int isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga(int isbn, String naziv, int godinaIzdanja) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String Naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor a) {
		this.autor = a;
	}

	public void stampaj() {
		System.out.println("ISBN broj knjige je " + this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println("Autor: " + this.getAutor().getIme() + " " + this.getAutor().getPrezime());
		System.out.println("\n");
	}

}
