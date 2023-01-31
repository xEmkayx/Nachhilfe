package Januar.Mon31;

public class RekursionStarter {
    private final int MEDIKAMENTENMENGE = 5;
    public static void main(String[] args) {
        System.out.println(medikamentenmenge(2));
    }

    public static double medikamentenmenge(int tag){
        double menge = 0;
        if (tag == 1){
            menge = 5;
        }
        else {
            menge = 0.6 * medikamentenmenge(tag - 1) + 5;
        }
        return menge;
    }


















    /*
    public static double medikamentenmenge(int tag){
        if (tag == 0){
            return 5;
        }
        double menge = medikamentenmenge(tag-1)* 0.6 + 5;
        return menge;
        // return medikamentenmenge(tag * 0.6);

    }
*/





}
