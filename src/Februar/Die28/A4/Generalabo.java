package Februar.Die28.A4;

public class Generalabo extends Ticket {
    private String inhaber;
    // Nur für diese Person gültig!
    private String verfallsDatum; // String im Format JJJWTT
    // Nach diesem Datum ungültig!
    public Generalabo(int preis){
        super (preis);
    }
    // TODO Auto-generated constructor stub
    public void entwerten() {/* es passiert nix! */ }
    public String getVerfa11sDatum() { return verfallsDatum; }

    @Override
    public boolean gueltigInZone(int zone) {
    // TODO Auto-generated method stub
        return false;
    }
    public String giblnhaber() { return inhaber; }
    }
