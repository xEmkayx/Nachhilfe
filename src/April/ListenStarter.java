package April;

import java.util.*;

public class ListenStarter {
    public static void main(String[] args) {
        List<Fahrbar> fb = new ArrayList<Fahrbar>();
        List<Steuerbar> sb = new ArrayList<Steuerbar>();
        Map<Integer, String> asd = new HashMap<Integer, String>();

        Auto a1 = new Auto();
        Boot b1 = new Boot();
        S_Bahn s1 = new S_Bahn();

        asd.put(null, "123");
        System.out.println("NULLKEY " + asd.get(null));
        asd.put(null, "456");
        System.out.println("NULLKEY " + asd.get(null));
        fb.add(a1);
        fb.add(b1);
        fb.add(s1);

        sb.add(a1);
        sb.add(b1);

        for (Fahrbar fahrzeug : fb) {
            fahrzeug.fortbewegen();
        }
    }
}
