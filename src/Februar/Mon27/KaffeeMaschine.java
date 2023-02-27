package Februar.Mon27;

import java.util.Scanner;

/**
 * Starterklasse dieser Aufgabe
 */
public class KaffeeMaschine {

    /*
    Rezepte deklarieren und initialisieren
    Da die Rezepte nicht verändert werden, können sie final gesetzt werden
     */
    private static final Rezept kaffeeSchwarz = new Rezept("Kaffee schwarz", 0.2, 0.02, 0.0, 0.0, 0.0);
    private static final Rezept kaffeeZucker = new Rezept("Kaffee Zucker", 0.2, 0.02, 0.0, 0.02, 0.0);
    private static final Rezept kaffeeMilch = new Rezept("Kaffee Milch", 0.2, 0.02, 0.0, 0.0, 0.02);

    /*
    Kaffeemaschine-interne Behälter für Wasser, Kaffe, Kakao, etc... initialisieren. Da auch diese die gleichen Behälter bleiben --> final
     */
    private static final ZutatenBehaelter behaelterWasser = new ZutatenBehaelter(Zutat.WASSER, 1.0, 1.5);
    private static final ZutatenBehaelter behaelterKaffee = new ZutatenBehaelter(Zutat.KAFFEE, 1.0, 1.5);
    private static final ZutatenBehaelter behaelterKakao = new ZutatenBehaelter(Zutat.KAKAO, 1.0, 1.5);
    private static final ZutatenBehaelter behaelterZucker = new ZutatenBehaelter(Zutat.ZUCKER, 1.0, 1.5);
    private static final ZutatenBehaelter behaelterMilch = new ZutatenBehaelter(Zutat.MILCH, 1.0, 1.5);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true; //boolean für endlosschleife (Endlosschleifen sind schlechter Stil. Stattdessen boolean definieren, der eine Abbruchbedingung darstellt (siehe case 5)
        while (keepRunning) {
            //User über die Möglichkeiten informieren
            System.out.println("Wählen Sie eine Option!");
            System.out.println("1. Kaffee schwarz");
            System.out.println("2. Kaffee zucker");
            System.out.println("3. Kaffee Milch");
            System.out.println("4. Füllstände zeigen");
            System.out.println("5. Schalte Kaffeemaschine aus");

            int eingabe = scanner.nextInt(); //gewählten index einlesen (nicht fehlerabgesichert - kommt noch bei Exceptions später im Jahr)
            //Statt if - ifelse - ifelse - ifelse einen Switch über die eingabe
            switch (eingabe) {
                case 1:
                    getGetraenk(kaffeeSchwarz);
                    break;
                case 2:
                    getGetraenk(kaffeeZucker);
                    break;
                case 3:
                    getGetraenk(kaffeeMilch);
                    break;
                case 4:
                    printInfo();
                    break;
                case 5:
                    keepRunning = false; //Abbruchbedingung
                    break;
                default:
                    //Defaults IMMER benutzen!
                    System.out.println("Option nicht vefügbar!");
                    break;
            }
        }
        scanner.close();
    }

    /**
     * Erstellt ein Getränk und leert die Behälter den Rezepten entsprechend
     */
    private static void getGetraenk(Rezept r) {
        behaelterWasser.entnehmen(r.getWasserMenge());
        behaelterKaffee.entnehmen(r.getKaffeeMenge());
        behaelterKakao.entnehmen(r.getKakaoMenge());
        behaelterZucker.entnehmen(r.getZuckerMenge());
        behaelterMilch.entnehmen(r.getMilchMenge());
    }

    /**
     * Gibt info über alle Behälter und deren Füllstände
     */
    private static void printInfo() {
        System.out.println(behaelterWasser.toString()); //die toString Methode wird in Sysos retundant. Aber NUR da. Also Just for your info. Schreibts in der Klausur TROTZDEM hin!
        System.out.println(behaelterKaffee.toString());
        System.out.println(behaelterKakao.toString());
        System.out.println(behaelterZucker.toString());
        System.out.println(behaelterMilch.toString());
    }

}
