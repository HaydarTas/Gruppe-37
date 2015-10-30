package cdio2;

public class Konto {
	
	private int pengebeholdning = 0;

	public int getPengebeholdning() {
		return pengebeholdning;
	}

	public void addToPengebeholdning(int pengebeholdning) {
		this.pengebeholdning = pengebeholdning + this.pengebeholdning ;
	}

}
