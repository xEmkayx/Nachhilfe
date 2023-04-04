package Maerz.Mon20;

interface Vergleichbar {
    /*
     * vergleicht das aufgerufene Objekt mit dem als Parameter uebergebenen
     * Objekt; liefert: -1 falls das aufgerufene Objekt kleiner ist als das
     * Parameterobjekt 0 falls beide Objekte gleich gross sind 1 falls das
     * aufgerufene Objekt groesser ist als das Parameterobj.
     */
    public int vergleichenMit(Vergleichbar obj);
}