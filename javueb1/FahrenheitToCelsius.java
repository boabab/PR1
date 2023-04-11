package javueb1;

// Pflichtübung 1 Aufgabe 1

import java.util.Scanner;

// Programm zur Berechnung der Celsius Temperatur 
// bei bekannter Fahrenheit Temperatur

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		// Benötigte Variablen deklarieren
		double epsilon = 0.005;
		double fahrenheit = 0.0, celsius;

		// Für die Eingabe von der Tastatur
		Scanner in = new Scanner(System.in);

		// Berechnungsschleife
		do {
			// Anleitung
			System.out.println("Programm endet durch Eingabe von 1");
			System.out.println("Eingabe der Fahrenheit-Temperatur: ");
			// Eingabe, Double-Wert einlesen
			fahrenheit = in.nextDouble();
			// Umrechnen in Celsius
			celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
			// Ausgabe des Ergebnis
			System.out.println("... in Celsius: " + celsius + " Grad \n");
			// Schleife durch Eingabe von 1 verlassen?
		} while (Math.abs(fahrenheit - 1) > epsilon);

		System.out.println("... und tschüss");
		in.close();
	}
}