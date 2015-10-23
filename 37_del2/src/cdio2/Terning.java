package cdio2;

public class Terning {

		private int vaerdi;
		
		public int roll() {
			this.vaerdi = (int) (Math.random() * 6 + 1); 
			return this.vaerdi;
		}
		
		public int getVaerdi() {
			return this.vaerdi;
		}
	}


