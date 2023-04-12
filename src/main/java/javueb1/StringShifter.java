package javueb1;

// Pflichtübung 2 Aufgabe 2

import java.util.Scanner;

// Jedes Zeichen des Eingabe-Strings wird um 1 Buchstaben im Alphabet verschoben A -> B 

public class StringShifter {
	public static void main(String[] args) {
		// Variablen deklarieren
		String output = "";
		String input;
		
		// Eingabe (Zeichenkette) einlesen
		System.out.println("Geben Sie eine Zeichenkette ein: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		scanner.close();

		// Zeichenschleife
		for(int i=0; i<input.length(); i++) {
			// Zeichen einlesen und in Zahlenwert (int) umwandeln
			char charAt = input.charAt(i);
			int charValue = (int) charAt;
            int outValue = charValue;
			
			// Ausnahmefall Z -> A || z -> a
			// 90 steht für 'z'
			// 122 steht für 'Z'
			// (um 26 nach links verschieben)
			if (charValue == 'Z' || charValue == 'z') {
				outValue -= 26;
			}
			
			// Zahl um 1 verschieben (A -> B)
			// 65 bis 90 oder 65+32 bis 90+32
			if (('A' <= charValue && charValue <= 'Z') || ('a' <= charValue && charValue <= 'z')) {
				outValue += 1;
			}

			charAt = (char) outValue;
			// Verändertes Zeichen zur Ausgabe hinzufügen
			output += charAt;
		}
		System.out.println(output);
	}

}