package Februar.Die28.A4;

public class Einzelticket extends Ticket {
    private int zone;
    // Nur in dieser Zone gültig!
    private String verfallsDatum;

    public Einzelticket(int preis) {
        super(preis);
    }

    public Einzelticket(int preis, String verfallsDatum, int zone) {
        super(preis);
        this.verfallsDatum = verfallsDatum;
        this.zone = zone;
    }

    public String getVerfa11sDatum() {
        return verfallsDatum;
    }

    @Override
    public boolean gueltigInZone(int zone) {
        return false;
    }
}