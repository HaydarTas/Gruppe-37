package cdio2;

public class Konto {
	
	private int pengebeholdning = 0;

	public int getPengebeholdning() {
		return pengebeholdning;
	}

	public boolean addToPengebeholdning(int pengebeholdning) {
		if(this.pengebeholdning + pengebeholdning < 0){
			return false;
		}else{
			this.pengebeholdning = pengebeholdning + this.pengebeholdning ;	
			return true;
		}
	}

}
