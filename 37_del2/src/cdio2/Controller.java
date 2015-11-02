
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
	
	Felt[] felter = new Felt[13];

	public static void main(String[] args) {
		new Controller().run();
	}

	public void run() {

		setupGame();

		setupGUI();

		while (true) {

			playerTurn(spiller1);

			if (spiller1.getSaldo() >= 3000) {
				GUI.showMessage("spiller "+ spiller1.getNavn() +" vinder spillet med " + spiller1.getSaldo() + "point");
				System.out.println("spiller "+spiller1.getNavn()+" vinder spillet med " + spiller1.getSaldo() + "point");
				break;
			}
			else if (spiller2.isBankrupt()) {
				GUI.showMessage("spiller "+spiller1.getNavn()+" vinder spillet da spiller "+spiller2.getNavn()+" gik konkurs. ");
				System.out.println("spiller "+spiller1.getNavn()+" vinder spillet da spiller "+spiller2.getNavn()+" gik konkurs. ");
				break;
			}

			playerTurn(spiller2);

			if (spiller2.getSaldo() >= 3000) {				
				GUI.showMessage("spiller "+ spiller2.getNavn() +" vinder spillet med " + spiller2.getSaldo() + "point");
				System.out.println("spiller "+spiller2.getNavn()+" vinder spillet med " + spiller2.getSaldo() + "point");

				
				break;
			}
			else if (spiller1.isBankrupt()) {
				GUI.showMessage("spiller "+spiller2.getNavn()+" vinder spillet da spiller "+spiller1.getNavn()+" gik konkurs. ");
				System.out.println("spiller "+spiller2.getNavn()+" vinder spillet da spiller "+spiller1.getNavn()+" gik konkurs. ");

				break;
			}
		}

	}

	private void playerTurn(Spiller spiller) {

		int slag = baeger.roll();

		int point = felter[slag].getPoint();
		String felt = felter[slag].getfeltNavn();
		boolean saldo_tjek = spiller.addToSaldo(point);
		
		if(saldo_tjek == true){
			GUI.setBalance(spiller.getNavn(), spiller.getSaldo());			
		}
		else{
			spiller.setBankRupt();
		}

		System.out.println("spiller" + spiller.getNavn() + "  har slået: " + slag + " han fik: " + point
				+ " og han har landet på felt: " + felt + ", saldo:" + spiller.getSaldo());

	}

	private void setupGame() {
		felter[2] = new Felt("tower", 250);
		felter[3] = new Felt("Crater", -100);
		felter[4] = new Felt("Palace gates", 100);
		felter[5] = new Felt("Cold Desert", -20);
		felter[6] = new Felt("Walled city", 180);
		felter[7] = new Felt("Monastery", 0);
		felter[8] = new Felt("Black cave", -70);
		felter[9] = new Felt("Huts in the mountain", 60);
		felter[10] = new Felt("The werewall(werewolf-wall)", -80);
		felter[11] = new Felt("The pit", -50);
		felter[12] = new Felt("Goldmine", 650);

	}

	private void setupGUI() {

		Field[] fields = new Field[11];

		fields[0] = new Street.Builder().setBgColor(Color.gray).setTitle("tower").build();

		fields[1] = new Street.Builder().setBgColor(Color.blue).setTitle("Crater").build();

		fields[2] = new Street.Builder().setBgColor(Color.white).setTitle("Palace gates").build();
		fields[3] = new Street.Builder().setBgColor(Color.gray).setTitle("Cold Desert").build();
		fields[4] = new Street.Builder().setBgColor(Color.green).setTitle("Walled city").build();
		fields[5] = new Street.Builder().setBgColor(Color.orange).setTitle("Monastery").build();
		fields[6] = new Street.Builder().setBgColor(Color.DARK_GRAY).setTitle("Black cave").build();
		fields[7] = new Street.Builder().setBgColor(Color.magenta).setTitle("Huts in the mountain").build();
		fields[8] = new Street.Builder().setBgColor(Color.CYAN).setTitle("The werewall(werewolf-wall)").build();
		fields[9] = new Street.Builder().setBgColor(Color.blue).setTitle("The pit").build();
		fields[10] = new Street.Builder().setBgColor(Color.CYAN).setTitle("Goldmine").build();

		spiller1.setNavn(" Christian");
		spiller2.setNavn(" Ronni");

		GUI.create(fields);

		Car car = new Car.Builder().typeCar().patternHorizontalDualColor().primaryColor(Color.RED)
			

		.build();
		GUI.addPlayer(spiller1.getNavn(), 1000, car);

		Car car2 = new Car.Builder().typeCar().patternHorizontalDualColor().primaryColor(Color.black)
				.build();
		GUI.addPlayer(spiller2.getNavn(), 1000, car2);
	}
}
