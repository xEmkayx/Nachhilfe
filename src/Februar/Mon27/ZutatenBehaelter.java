package Februar.Mon27;

/**
 * ZutatenBehaelter erbt von Behaelter -> Konstruktor und toString()-Methode MÜSSEN ausprogrammiert werden
 */
public class ZutatenBehaelter extends Behaelter{

    private Zutat zutat;

    public ZutatenBehaelter(Zutat zutat, double maxFuellung, double fuellStand) {
        super(maxFuellung, fuellStand); //super wird verwendet um zu signalisieren, dass eine Methode oder ein Attribut aus der Elternklasse kommt
        this.zutat = zutat;
    }

    /**
     * Prüft, ob die Operation möglich ist. Falls ja, wird sie ausgeführt. Falls nein, wird der User benachrichtigt
     */
    public void entnehmen(double menge) {
        if (super.fuellStand - menge >= 0) { //true, wenn die Operation möglich ist
            super.fuellStand = super.fuellStand - menge; //neuen Füllstand setzen
        } else {
            System.out.println("Operation nicht möglich, da Behälter für " + zutat.getName() + " nicht voll genug"); //User mitteilen, dass die Operation nicht möglich ist
        }
    }

    @Override
    public String toString() {
        return "Behälter für " + zutat.getName() + " (" + super.fuellStand + "/" + super.maxFuellung + ")";
    }
}
