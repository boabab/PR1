package javueb1;

// Pflichtübung 2 Aufgabe 3

import java.util.Scanner;

// Programm zur Berechnung aller Primzahlen kleiner gleich eingegebener Zahl.
// Nach dem Verfahren von Eratosthenes

public class SieveOfEratosthenes {
    public static void main(String[] args) {
		// Variablen deklarieren
		int number;
		
		// Für die Eingabe von der Tastatur
        System.out.print("Geben Sie die maximale Zahl n ein: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
		scanner.close();
		boolean[] isPrime = new boolean[number+1];

		// Initialisierung von boolean[] isPrime
        for (int i = 2; i <= number; i++) {
            isPrime[i] = true;
        }
		
		// "Sieben" der Vielfachen aller Primzahlen
        for (int i = 2; i+i <= number; i++) {
            if (isPrime[i]) {
                for (int j = i+i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }
		
		// Ausgabe
        System.out.println("Die Primzahlen von 2 bis " + number + " sind:");
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}