package Februar.Mon27;

/**
 * Abstrakte Klasse, damit man kein Objekt dieser Klasse erstellen kann
 */
public abstract class Behaelter {

    protected double maxFuellung; //protected wegen vererbung
    protected double fuellStand;

    public Behaelter(double maxFuellung, double fuellStand) {
        this.maxFuellung = maxFuellung;
        this.fuellStand = fuellStand;
    }

    /**
     * Abstrakte Methoden MÜSSEN in Subklassen ausprogrammiert werden
     */
    public abstract String toString();
}
