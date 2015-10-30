
package cdio2;

public class Konto {
	
	private int pengebeholdning = 0;

	public int getPengebeholdning() {
		return pengebeholdning;
	}

	public void setPengebeholdning(int pengebeholdning) {
		this.pengebeholdning = pengebeholdning + this.pengebeholdning ;
	}

}
