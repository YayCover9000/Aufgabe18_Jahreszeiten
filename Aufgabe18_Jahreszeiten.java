import java.util.Scanner;
public class Aufgabe18_Jahreszeiten {
	public static void main(String [] args) {
//		//TODO • Gegeben sei eine Zahl.
//		• Bestimmen, ob es sich bei der Zahl um eine Jahreszeit (season) handelt. Dabei wird die
//		Zahl als Monat interpretiert, d.h. 3, 4, und 5 als „spring“, 6, 7, und 8 als „summer“, 9,
//		10 und 11 als „fall“ und 1, 2, 12 als „winter“.
//		• Geben Sie entsprechend folgenden Text aus:
//		• "Month <Zahl> is <season>.“ oder "No Season!“
		Scanner sc = new Scanner(System.in);
		int monatsZahl = sc.nextInt();
		String jahresZeit = "nix";
		
//		//mittelaltes switch case
//		switch(monatsZahl) {
//		case 3,4,5:
//			jahresZeit = "spring";
//		break;
//		case 6,7,8:
//			jahresZeit = "summer";
//		break;
//		case 9,10,11:
//			jahresZeit = "fall";
//		break;
//		case 1,2,12:
//			jahresZeit = "winter";
//		break;
//		default:
//			jahresZeit = "No Season!";
//		break;
//		}
		//L-Case
		switch(monatsZahl) {
		case 3,4,5 -> jahresZeit = "spring";
		case 6,7,8 -> jahresZeit = "summer";
		case 9,10,11 -> jahresZeit = "fall";
		case 12,1,2 -> jahresZeit = "winter";
		default -> jahresZeit = "No Season!";
		}
		System.out.println("Month " + monatsZahl + " is " + jahresZeit + ".");
		sc.close();
	}
}
