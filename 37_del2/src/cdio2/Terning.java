package cdio2;

public class Terning {
	private int vaerdi;

	public int roll() {		
      this.vaerdi =  (int) (Math.random() * 6 + 1);
      return this.vaerdi;	
	}
	// getvaerdi skal oprettes så klasser udfra kan hente værdien for vaerdi.
	public int getVaerdi() {
		return vaerdi;
	}


}
