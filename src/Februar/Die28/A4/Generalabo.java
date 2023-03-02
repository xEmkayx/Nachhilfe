package Februar.Die28.A4;

public class Generalabo extends Ticket {
    private String inhaber;
    private String verfallsDatum; // String im Format JJJWTT

    public Generalabo(int preis){
        super (preis);
    }

    public Generalabo(int preis, String inhaber, String verfallsDatum) {
        super(preis);
        this.inhaber = inhaber;
        this.verfallsDatum = verfallsDatum;
    }

    public void entwerten() {/* es passiert nix! */ }
    public String getVerfallsDatum() { return verfallsDatum; }

    @Override
    public boolean gueltigInZone(int zone) {
    // TODO Auto-generated method stub
        return false;
    }
    public String gibInhaber() { return inhaber; }
}
