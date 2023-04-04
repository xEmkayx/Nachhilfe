package Maerz.Mon20;

class NuetzlicheFunktionen {
    // liefert ein "kleinstes" (auf der Basis der
    // Vergleichbar-Implementierung!) Element des Parameter-Arrays
    // Achtung: Man kann davon ausgehen, dass das Parameter-Array
    // mindestens 1 Element enthaelt
    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {
        Vergleichbar klElement = elemente[0];
        for (Vergleichbar element : elemente) {
            if (element.vergleichenMit(klElement) > 0){
                klElement = element;
            }
        }
        return klElement;
    }
}