package p14_05_2021;

public class ClanskaKarta {
//	popust (u rasponu od 5 do 10 %)
//	broj kartice (npr: 9329-0239)
//	gettere i setter 
//	konstuktore

	private double popust;
	private String brKart;

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public String getBrKart() {
		return brKart;
	}

	public void setBrKart(String brkart) {
		this.brKart = brKart;
	}

	public ClanskaKarta(double popust, String brKart) {
		this.popust = popust;
		this.brKart = brKart;
	}

}
