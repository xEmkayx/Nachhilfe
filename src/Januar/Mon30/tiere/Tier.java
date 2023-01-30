package Januar.Mon30.tiere;

/**
 * Soll möglichst redundanzfrei sein!
 * Attribute
 *  - name: String
 *  - art: Enum
 *  - diät (Fleisch-, Pflanzenfresser, Allesfresser, ...): Enum
 *  - gewicht: double
 *  - beine: int
 *  - anzahl (erstellter Tiere): static int
 *
 *  Methoden
 *   - Laut machen
 *   - fressen
 *   - fortbewegen
 *   - abfrage wieviele Tiere schon erstellt wurden
 *
 *   Konstruktoren:
 *    - (name, art)
 *    - (alles...)
 */
public class Tier {

    /**
     * Statische Attribute werden in der Regel über allen anderen Attributen deklariert (und/oder initialisiert).
     * Diese Anzahl soll statisch sein, da sie objektübergreifend gleich ist.
     * Sie gehört nicht einem einzelnen Objekt der Klasse Tier, sondern der Klasse selbst
     */
    private static int anzahl = 0;

    private String name;
    private Tierart art;
    private Diaet diaet;
    private Laut laut;
    private double gewicht;
    private int beine;

    public Tier(String name, Tierart art, Diaet diaet, double gewicht, int beine, Laut laut) {
        this.name = name;
        this.art = art;
        this.diaet = diaet;
        this.gewicht = gewicht;
        this.beine = beine;
        this.laut = laut;
        anzahl++;
    }

    public Tier(String name, Tierart art) {
        this.name = name;
        this.art = art;
        anzahl++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tierart getArt() {
        return art;
    }

    public void setArt(Tierart art) {
        this.art = art;
    }

    public Diaet getDiaet() {
        return diaet;
    }

    public void setDiaet(Diaet diaet) {
        this.diaet = diaet;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getBeine() {
        return beine;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public Laut getLaut() {
        return laut;
    }

    public void setLaut(Laut laut) {
        this.laut = laut;
    }

    /**
     * Diese Methode ist statisch, da das Attribut anzahl statisch ist. Demnach wollen wir es nicht auf einem Tier-Objekt,
     * sondern auf der ganzen Klasse aufrufen. Aufruf: int erstellteTiere = Tier.getAnzahl()
     * @return Anzahl an erstellten Tieren
     */
    public static int getAnzahl() {
        return anzahl;
    }

    /**
     * Macht den Laut, der im Konstruktor mitgegeben wurde
     *
     * Vorsicht! Diese Methode kann eine NullPointerException wegen dem privaten Attribut laut werfen, wenn dieses
     * nicht im Konstruktor, oder einen Setter gesetzt wurde!
     */
    public void lautMachen() {
        System.out.println(this.name + ": " + this.laut.getLaut());
    }

    /**
     * Das Tier macht einen mitgegebenen Laut
     * @param laut Laut, den das Tier macht als String
     */
    public void lautMachen(String laut) {
        System.out.println(this.name + ": " + laut);
    }

    /**
     * Das Tier macht einen mitgegebenen Laut
     * @param laut Laut, den das Tier macht als vorgegebenes Enum-Element
     */
    public void lautMachen(Laut laut) {
        System.out.println(this.name + ": " + laut.getLaut());
    }

    /**
     * Überschreibt die Methode toString() in der Object Klasse, von der JEDE andere Klasse in Java erbt
     * Dies verhindert eine toString()-Ausgabe "Tier@23964" oder Ähnliches
     */
    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                ", art=" + art +
                ", diaet=" + diaet +
                ", gewicht=" + gewicht +
                ", beine=" + beine +
                '}';
    }

}
