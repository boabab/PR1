package javueb2;

// Pflichtübung 2 Aufgabe 4

import java.util.Scanner;

// Programm zur Umrechnung von römischen Zahlen in die normale Schreibweise

public class RomanNumerals {
	public static void main(String[] args) {
		// Variablen deklarieren
		int number;
		String output = "";
		
		// Eingabezahl Einlesen
		System.out.print("Geben Sie eine Ganzzahl (von 1 bis 3999) ein: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();

		// Fehlermeldung
		if (number < 1 || number > 3999) {
			System.out.println("Fehler: Die Eingabe muss zwischen 1 und 3999 liegen.");
			return;
		}

		// Umwandlung
		while (number > 0) {
			// 1000er
			if (number >= 1000) {
				output += "M";
				number -= 1000;
			}
			else if (number >= 900) {
				output += "CM";
				number -= 900;
			}
			else if (number >= 500) {
				output += "D";
				number -= 500;
			}
			else if (number > 400) {
				output += "CD";
				number -= 400;
			}
			
			// 100er
			else if (number < 400 && number >= 100) {
				output += "C";
				number -= 100;
			}
			else if (number >= 90) {
				output += "XC";
				number -= 90;
			}
			else if (number >= 50) {
				output += "L";
				number -= 50;
			}
			else if (number > 40) {
				output += "XL";
				number -= 40;
			}

			// 10er
			else if (number < 40 && number >= 10) {
				output += "X";
				number -= 10;
			}
			else if (number == 9) {
				output += "IX";
				number -= 9;
			}
			else if (number >= 5) {
				output += "V";
				number -= 5;
			}
			else if (number == 4) {
				output += "IV";
				number -= 4;
			}
			else if (number < 4) {
				output += "I";
				number -= 1;
			}
		}

		// Ausgabe
		System.out.println("Als römische Zahl: " + output);
	}
}