package Maerz.Mon20.Polygone;

public class Rechteck implements Polygon {

    @Override
    public int getFlaeche(int laenge, int breite) {
        return laenge * breite;
    }
}
