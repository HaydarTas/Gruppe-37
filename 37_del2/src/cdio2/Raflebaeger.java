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
	
	public boolean isEqual(){
		if (t1.getVaerdi()==t2.getVaerdi()){
			 return true;
		}
		return false;
	}

	
	public int getTerningSum(int res){

		return t1.getVaerdi() + t2.getVaerdi();
		
	}

}