package javueb1;

// Pflichtübung 1 Aufgabe 2

import java.util.Scanner;

// Programm zur Berechnung der Summe aller eingegebenen geraden Zahlen
// und Anzahl aller eingegebenen Zahlen.
// Stoppt bei Eingabe negativer Zahl.

public class EvenNumberSum {

    public static void main(String[] args) {
		
		// Variablen deklarieren
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

		// Berechnungsschleife
        while(true) {
			// Anleitung
            System.out.print("Geben Sie eine ganze Zahl ein: ");
			// Eingabe, Integer-Wert einlesen
            int number = scanner.nextInt();
			
            // Eingabe beenden, wenn Zahl negativ ist
            if(number < 0) {
                break;
            }
            // Summe um Eingabe erhöhen, wenn diese gerade ist
            if(number % 2 == 0) {
                sum += number;
            }
            // Anzahl der eingegebenen Zahlen erhöhen
            count++;
        }
        // Ausgabe der Ergebnisse
        System.out.println("Gesamtsumme der geraden Zahlen: " + sum);
        System.out.println("Anzahl aller eingegebenen Zahlen: " + count);
    }
}