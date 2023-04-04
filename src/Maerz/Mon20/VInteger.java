package Maerz.Mon20;

public class VInteger extends Integer implements Vergleichbar {
    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        /*
         * vergleicht das aufgerufene Objekt mit dem als Parameter uebergebenen
         * Objekt; liefert: -1 falls das aufgerufene Objekt kleiner ist als das
         * Parameterobjekt 0 falls beide Objekte gleich gross sind 1 falls das
         * aufgerufene Objekt groesser ist als das Parameterobj.
         */
        VInteger v1 = (VInteger) obj;
        int r;

        if (this.getWert() > v1.getWert()){
            r = -1;
        } else if (this.getWert() == v1.getWert()){
            r = 0;
        }else {
            r = 1;
        }
        return r;
    }
}
