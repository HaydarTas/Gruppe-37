package cdio2;

import desktop_codebehind.FieldFactory;
import desktop_fields.Field;

public class Spiller {

	private String navn;
	private Konto konto;
	private boolean bankRupt = false;

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

	public boolean isBankrupt() {
		// TODO Auto-generated method stub
		return bankRupt ;
	}

}
