package Januar.Mon30.tiere;

/**
 * In diesem Enum kann man sehen, wie man Enum-Objekten Attribute, Konstruktoren und Methoden zuweist
 *
 * Enums haben festgelegte Objekte. Das heißt der Programmierer weiß im Vorfeld bereits, welche Objekte mit welchen Werten
 * angelegt werden müssen. Da diese Objekte nicht verändert werden sollen, besitzen sie einen privaten Konstruktor.
 * In diesem Beispiel fehlt die Sichtbarkeit "private" komplett, da private Konstruktoren bei Enums Standard sind und daher
 * eine explizite Erwähnung des Schlüsselworts "private" redundant ist. (selber ausprobieren -> wird ausgegraut)
 *
 * Wie normale Objekte von anderen Klassen auch, können auch Enums ganz normale public ... Methoden haben.
 * Aufruf: String laut = Laut.HUND.getLaut();
 *
 * Objekte in einem Enum sind stets großzuschreiben
 */
public enum Laut {

    HUND("Wuff"),
    KATZE("Miau"),
    LOEWE("ROAAARRRR")
    ;

    private final String laut; //da der String laut nicht mehr geändert wird, kann er auf final gesetzt werden

    Laut(String laut) {
        this.laut = laut;
    }

    public String getLaut() {
        return laut;
    }
}
