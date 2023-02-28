package Februar.Die28.A4;

public class Mehrfahrtenkarte extends Ticket {
    private int fahrten;
    // Anzahl erlaubte Fahrten
    private int zone;

    // Nur in dieser Zone gültig!
    public Mehrfahrtenkarte(int preis, int fahrten, int zone) {
        super(preis);
        this.fahrten = fahrten;
        this.zone = zone;
    }

    public void entwerten() {
        if (fahrten == 0) return;
        fahrten -= 1;
    }

    public boolean istEntwertet() {
        return fahrten == 0;
    }

    @Override
    public boolean gueltigInZone(int zone) {
        return zone == this.zone;
    }
}