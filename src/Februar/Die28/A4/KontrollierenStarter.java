package Februar.Die28.A4;

public class KontrollierenStarter {

    public static void main(String[] args) {
        String[] namen = {"Brunhilde Bingen", "Curie Marie", "Zimmer Hans", "Wavy Andy", "Schwarzfahrer"};
        Ticket[] tickets = {
                new Einzelticket(10, "20231030", 3),
                new Generalabo(80, "Curie Marie", "19601224"),
                new Mehrfahrtenkarte(24, 10, 3),
                new Einzelticket(10, "20230930", 2),
        };
        int aktuelleZone = 3;
        String aktuellesDatum = "20230228";

        kontrolliere(namen, tickets, aktuelleZone, aktuellesDatum);
    }

    public static int kontrolliere(String[] namen, Ticket[] tickets, int zone, String datum) {
        int schwarzFahrer = 0;

        if (namen.length > tickets.length) {
            schwarzFahrer = schwarzFahrer + (namen.length - tickets.length);
        }

        for (int i = 0; i < tickets.length; i++) {
            String tickettyp = tickets[i].getClass().getName();
            //
            switch (tickettyp) {
                case "Einzelticket":
                    Einzelticket einzelticket = (Einzelticket) tickets[i];
                    // Vergleichen Einzelticket
                    if((einzelticket.gueltigInZone(zone) == false)
                       || (einzelticket.getVerfallsDatum().compareTo(datum) <= 0)){
                        schwarzFahrer++;
                    }
                    break;
                case "Mehrfachkarten":
                    break;
                case "Generalabo":
                    break;
                default:
                    System.out.println("Tickettyp exitiert nicht");
            }
        }


        for (Ticket ticket : tickets) {

        }


        return schwarzFahrer;
    }

}
