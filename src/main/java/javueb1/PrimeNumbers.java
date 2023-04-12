package javueb1;

// Pflichtübung 2 Aufgabe 1

import java.util.Scanner;

// Programm zur Berechnung aller Primzahlen kleiner gleich eingegebener Zahl.

public class PrimeNumbers {

	public static void main(String[] args) {
		// Variablen deklarieren
		int input;
		int divider;
		boolean foundDivider;

		// Eingabezahl Einlesen
		System.out.print("Geben Sie die maximale Zahl n ein: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		scanner.close();

		// Zahlen kleiner Eingabe auf Primzahleingenschaft überprüfen
		System.out.println("Primzahlen bis " + input + ":");
		for (int number = 2; number <= input; number++) {
			foundDivider = false;
			divider = number - 1;
			while (!foundDivider) {
				if (number % divider == 0) {
					// Wenn nur durch 1 teilbar, dann Primzahl
					if (divider == 1) {
						System.out.println(number);
					}
					foundDivider = true;
				}
				divider--;
			}
		}
	}
}
