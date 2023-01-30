package Januar.Mon30;

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

    private static int anzahl = 0;

    private String name;
    private Tierart art;
    private Diaet diaet;
    private double gewicht;
    private int beine;

    public Tier(String name, Tierart art) {
        this.name = name;
        this.art = art;
        anzahl++;
    }

    public Tier(String name, Tierart art, Diaet diaet, double gewicht, int beine) {
        this.name = name;
        this.art = art;
        this.diaet = diaet;
        this.gewicht = gewicht;
        this.beine = beine;
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

    public static int getAnzahl() {
        return anzahl;
    }

    public void lautMachen() {
        switch (this.art) {
            case REPTILIEN:
                System.out.println(name + " schleckt seine Augen ab");
                break;
            case SAEUGETIERE:
                System.out.println(name + " macht \"Wähhhhh Muttermilch!\"");
                break;
            default:break;
        }
    }

    public void lautMachen(String laut) {
        System.out.println(this.name + ": " + laut);
    }

    public void lautMachen(Laut laut) {
        System.out.println(this.name + ": " + laut.getLaut());
    }

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

    public enum Tierart {
        SAEUGETIERE,
        REPTILIEN,
        AMPHIBIEN,
        FISCHE,
        VOEGEL; //; optional
    }

    public enum Diaet {
        FLEISCHFRESSER,
        PFLANZENFRESSER,
        ALLESFRESSER
    }

    public enum Laut {
        HUND("Wuff"),
        KATZE("Miau"),
        LOEWE("Grrrr")
        ;

        private String laut;

        Laut(String laut) {
            this.laut = laut;
        }

        public String getLaut() {
            return laut;
        }
    }
}
