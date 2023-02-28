package Februar.Die28.A4;

    public abstract class Ticket {
    private final int preis;
    private boolean entwertet;
    public Ticket( int preis ) {
        this.preis = preis;
        entwertet = false;
    }
        public int getPreis() { return preis; }
        public void entwerten() { entwertet = true; }
        public boolean istEntwertet() { return entwertet; }
        public abstract boolean gueltigInZone( int zone );
    }
