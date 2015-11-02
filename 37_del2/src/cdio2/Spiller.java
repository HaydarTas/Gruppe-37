package cdio2;


import desktop_codebehind.FieldFactory;
import desktop_fields.Field;

public class Spiller {

	private String navn;
	private Konto konto;
	private boolean bankRupt = false;

	public Spiller() {

		this.konto = new Konto();

		this.konto.addToPengebeholdning(1000);

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

	public boolean addToSaldo(int point) {
		return this.konto.addToPengebeholdning(point);

	}

	public boolean isBankrupt() {
		return bankRupt ;
	}
	public void setBankRupt(){
		bankRupt = true;
	}
}
