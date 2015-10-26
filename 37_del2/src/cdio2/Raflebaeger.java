package cdio2;



public class Raflebaeger {

	private Terning t1 = new Terning();
	private Terning t2 = new Terning();
    private String feltNavn; 
    
    
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
	public int getPoint(int res){
		
	int point = 0;
		 
		switch(res){
		
		case 2: 
			this.feltNavn = "Tower";
			point =  250;
			break; 
			
		case 3: 
			this.feltNavn = "Crater";
			point = -100;
			break; 
			
			
		case 4: 
			this.feltNavn = "Palace gates";
			point = 100;
			break; 
			
		case 5: 
			this.feltNavn = "Cold Desert";
			point = -20;
			break; 
			
		case 6: 
			this.feltNavn = "Walled city";
			point = 180;
			break; 
			
			
		case 7: 
			this.feltNavn = "Monastery";
			point = 0;
			break; 
				
			
		case 8: 
			this.feltNavn = "Black cave";
			point = -70;
			break; 	
		
		case 9: 
			this.feltNavn = "Huts in the mountain";
			point = 60;
			break;
		
		case 10: 
			this.feltNavn = "The Werewall";
			point = -80;
			break; 	
		
		case 12: 
			this.feltNavn = "Goldmine";
			point = 650;
			break; 	
	
		}
	
		return point;
		
	}
	public String getfeltNavn(){
		
		return feltNavn;
		
	}

}