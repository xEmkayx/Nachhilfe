package Maerz.Mon20.Polygone;

public class Quadrat implements Polygon {
    @Override
    public int getFlaeche(int laenge, int breite) {
        if (laenge != breite) {
            System.out.println("DAS IST KEIN QUADRAT!");
            return 0;
        }
        return laenge*laenge;
    }
}
