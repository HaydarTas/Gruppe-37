package cdio2;

import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {

		Spiller spiller1 = new Spiller();

		Spiller spiller2 =new Spiller();

		Raflebaeger baeger = new Raflebaeger();

		Scanner scan = new Scanner(System.in);

		System.out.println("tryk 'enter' for at starte spillet");


		while(true){
			scan.nextLine();
			int slag1 = baeger.roll();
			int point1 = baeger.getPoint(slag1);
			String felt1= baeger.getfeltNavn();
			spiller1.setSaldo(point1);

			System.out.println("spiller 1 har slået: " + slag1 + " han fik: "+ point1 + " og han har landet på felter: "+ 
					felt1+ ", saldo:"+ spiller1.getSaldo());


			scan.nextLine();

			int slag2 = baeger.roll();
			int point2 = baeger.getPoint(slag2);
			String felt2= baeger.getfeltNavn();
			spiller2.setSaldo(point2);

			System.out.println("spiller 2 har slået: " + slag2 + ", han fik: "+ point2 + " og han har landet på felter: "+ 
					felt2 + "saldo:"+ spiller2.getSaldo());

			if(spiller1.getSaldo()>=3000){
				System.out.println("spiller 1 vinder spillet med "+ spiller1.getSaldo()+ "point");

				System.exit(0);
			}

			if(spiller2.getSaldo()>=3000){
				System.out.println("spiller 2 vinder spillet med "+ spiller2.getSaldo()+ "point");

				System.exit(0);
			}

			if(spiller2.getSaldo() < 1){
				System.out.println("spiller 2 vinder spillet med "+ spiller2.getSaldo()+ "point");

				System.exit(0);
			}


		}

	}
}
