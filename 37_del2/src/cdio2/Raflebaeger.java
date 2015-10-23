package cdio2;

public class Raflebaeger {

	private Terning t1 = new Terning();
	private Terning t2 = new Terning();
      
	public int roll() {
		
		int res1 = t1.roll();
		int res2 = t2.roll();
		
		int res = res1 + res2;
		return res;
	}
	
	public int getTerning1Vaerdi() {
		return t1.getVaerdi();
	}
	
	public int getTerning2Vaerdi() {
		return t2.getVaerdi();
	}		

}
