package Maerz.Mon20;

import Maerz.Mon20.Polygone.Polygon;
import Maerz.Mon20.Polygone.Quadrat;
import Maerz.Mon20.Polygone.Rechteck;

public class Starter {
    public static void main(String[] args) {
        PolygonStarter();
    }

    private static void VergleichbarStarter(){
        /*
        Schreiben Sie ein kleines Testprogramm, das zunächst ein Array mit
        VInteger-Objekten erzeugt und initialisiert, anschließend die
        Funktion kleinstesElement mit diesem Array aufruft und
        den Wert des ermittelten kleinsten Elements auf den Bildschirm ausgibt
         */
        Vergleichbar[] elemente = new VInteger[4];
        elemente[0] = new VInteger(42);
        elemente[1] = new VInteger(300);
        elemente[2] = new VInteger(2);
        elemente[3] = new VInteger(666);

        Vergleichbar kE = NuetzlicheFunktionen.kleinstesElement(elemente);
        System.out.println(((VInteger) kE).getWert());
    }

    public static void PolygonStarter(){
        Polygon re = new Rechteck();
        Polygon q1 = new Quadrat();
        Polygon q2 = new Quadrat();

        System.out.println(re.getFlaeche(2, 5));
        System.out.println(q1.getFlaeche(2,5));
        System.out.println(q2.getFlaeche(2, 2));
    }
}

/*
1. Schreibt ein Interface 'Polygon' mit der Methode
'getFlaeche(int laenge, int breite)', die einen integer zurückgibt
2. Erstellt die Klassen Rechteck und Quadrat, die das Interface implementieren
3. Implementiert die Methode 'getFlaeche' für jede Klasse
3.1 Bei Quadrat testen, ob beide Seitenlängen gleich sind;
    falls nicht: rückgabe 0 und print, dass das kein Quadrat ist
4. TESTEN
 */