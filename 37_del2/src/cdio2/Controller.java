
package cdio2;

import java.awt.Color;
import desktop_codebehind.Car;
import desktop_fields.*;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Controller {
	Spiller spiller1 = new Spiller();
	Spiller spiller2 = new Spiller();
	Raflebaeger baeger = new Raflebaeger();
	Felt[] felter= new Felt[13];

	public static void main(String[] args) {
		new Controller().run();
	}
		
	public void run(){
		
		//Ask users for names and such
		setupGame();
		//Setup the GUI to look nice
		setupGUI();


		while(true){
			playerTurn(spiller1);
			playerTurn(spiller2);
			//TODO refactor
			//End of refactor
			if(spiller1.getSaldo()>=3000 ){
				GUI.showMessage("spiller 1 vinder spillet med "+ spiller1.getSaldo()+ "point");

				System.exit(0);
			}

			if(spiller2.getSaldo()>=3000 || spiller1.isBankrupt()){
				GUI.showMessage("spiller 2 vinder spillet med "+ spiller2.getSaldo()+ "point");

				System.exit(0);
			}
			//TODO fix logic error and merge with above
			if(spiller2.getSaldo() < 1){
				GUI.showMessage("spiller 2 vinder spillet med "+ spiller2.getSaldo()+ "point");

				System.exit(0);
			}


		}

	}

	private void playerTurn(Spiller spiller) {
		int slag = baeger.roll();
		//int point1 = baeger.getPoint(slag1);
		int point = felter[slag].getPoint();
		String felt= felter[slag].getfeltNavn();
		spiller.setSaldo(spiller.getSaldo()+point);
		GUI.setBalance(spiller.getNavn(), spiller.getSaldo());

		System.out.println("spiller" + spiller.getNavn() + "  har slået: " + slag + " han fik: "+ point + " og han har landet på felter: "+ 
				felt+ ", saldo:"+ spiller.getSaldo());		
	}

	private void setupGame() {
		felter[2]=new Felt("tower", 250);
		felter[3]=new Felt("Crater", -100);
		felter[4]=new Felt("Palace gates", 100);
		felter[5]=new Felt("Cold Desert", -20);
		felter[6]=new Felt("Walled city", 180);
		felter[7]=new Felt("Monastery", 0);
		felter[8]=new Felt("Black cave", -70);
		felter[9]=new Felt("Huts in the mountain", 60);
		felter[10]=new Felt("The werewall(werewolf-wall)", -80);
		felter[11]=new Felt("The pit", -50);
		felter[12]=new Felt("Goldmine", 650);
		
		
		spiller1.setNavn(" Ronaldo");
		spiller2.setNavn(" Messi");
	}

	private void setupGUI() {
		
		Field[] fields = new Field[2];
		fields[0] = new Street.Builder().setBgColor(Color.CYAN).setTitle("tower").build();
		fields[1] = new Street.Builder().setBgColor(Color.blue).setTitle("Crater").build();	
		fields[2] = new Street.Builder().setBgColor(Color.CYAN).setTitle("Palace gates").build();
		fields[3] = new Street.Builder().setBgColor(Color.blue).setTitle("Cold Desert").build();
		fields[4] = new Street.Builder().setBgColor(Color.CYAN).setTitle("Walled city").build();
		fields[5] = new Street.Builder().setBgColor(Color.blue).setTitle("Monastery").build();
		fields[6] = new Street.Builder().setBgColor(Color.CYAN).setTitle("Black cave").build();
		fields[7] = new Street.Builder().setBgColor(Color.blue).setTitle("Huts in the mountain").build();
		fields[8] = new Street.Builder().setBgColor(Color.CYAN).setTitle("The werewall(werewolf-wall)").build();
		fields[9] = new Street.Builder().setBgColor(Color.blue).setTitle("The pit").build();
		fields[10] = new Street.Builder().setBgColor(Color.CYAN).setTitle("Goldmine").build();
				
		GUI.create(fields);
		
		Car car = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.WHITE)
				.build();
		GUI.addPlayer(spiller1.getNavn(), 1000, car);
	}
}
