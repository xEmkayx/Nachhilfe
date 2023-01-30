package Januar.Mon30.tiere;

/**
 * Klasse, um die Enums mit den Tieren zu testen
 */
public class TierStarter {

    public static void main(String[] args) {
        Tier loewe = new Tier("Löwe", Tierart.SAEUGETIERE, Diaet.ALLESFRESSER, 200.0, 4, Laut.LOEWE);

        // Beispiel: Methoden überladen
        loewe.lautMachen(); // Gibt den im Konstruktor definierten Laut aus
        loewe.lautMachen(Laut.HUND); // Gibt den von Hunden üblichen Laut aus... ja, unser Löwe kann das!
        loewe.lautMachen("Kikerikiiii"); // Unser Löwe hat einen Sprachkurs gemacht und kann jetzt auf einem Bauernhof arbeiten

        //Beispiel: Switch auf Enums
        switch (loewe.getArt()) { //Kriterium
            case REPTILIEN:
                System.out.println(loewe.getName() + " schleckt seine Augen ab");
                break;
            case SAEUGETIERE:
                System.out.println(loewe.getName() + " macht \"Wähhhhh Muttermilch!\"");
                break;
            default:
                System.out.println(loewe.getName() + " macht nichts besonderes...");
                break;
        }
    }

}
