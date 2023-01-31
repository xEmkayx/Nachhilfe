package Januar.Mon31;

public enum Monat {
    JANUAR(31, Jahreszeit.WINTER),
    FEBRUAR(28, Jahreszeit.WINTER),
    MAERZ(31, Jahreszeit.FRUEHLING);

    public final int tage;
    public final Jahreszeit jahreszeit;

    Monat(int tage, Jahreszeit jahreszeit) {
        this.tage = tage;
        this.jahreszeit = jahreszeit;
    }

    public boolean in(Jahreszeit jz){
        return this.jahreszeit == jz;
    }

    public void getJahreszeit() {
        switch (this.jahreszeit){
            case WINTER -> System.out.println("Winter");
            case FRUEHLING -> System.out.println("Frühling");
            case HERBST -> System.out.println("HERBST");
            case SOMMER -> System.out.println("SOMMER");
        }
    }
}
