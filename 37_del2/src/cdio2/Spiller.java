package cdio2;

public class Spiller {

	private String navn;
	private Konto konto;

	public Spiller() {

		this.konto = new Konto();

		this.konto.setPengebeholdning(1000);

	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getSaldo() {
		return this.konto.getPengebeholdning();

	}

	public void setSaldo(int point) {
		this.konto.setPengebeholdning(point);

	}

}
