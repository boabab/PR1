package javueb2;

// Pflichtübung 2 Aufgabe 4

import java.util.Scanner;

// Programm zur Umrechnung von römischen Zahlen in die normale Schreibweise

public class RomanNumeralsBetter {
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
		String[] thousands = { "", "M", "MM", "MMM" };
		String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		int thousandsDigit = number / 1000;
		int hundredsDigit = (number % 1000) / 100;
		int tensDigit = (number % 100) / 10;
		int onesDigit = number % 10;

		output = thousands[thousandsDigit] + hundreds[hundredsDigit] + tens[tensDigit] + ones[onesDigit];

		// Ausgabe
		System.out.println("Als römische Zahl: " + output);
	}
}