package Februar.Mon27;

public class AbfallBehaelter extends Behaelter {

    public AbfallBehaelter(double maxFuellung, double fuellStand) {
        super(maxFuellung, fuellStand);
    }

    public void fuellen(double menge){
        if (this.fuellStand + menge <= this.maxFuellung) { //true, wenn die Operation möglich ist
            this.fuellStand = this.fuellStand + menge; //neuen Füllstand setzen
        } else {
            this.fuellStand = 0;
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
