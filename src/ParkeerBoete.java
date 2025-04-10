public class ParkeerBoete extends Verkeersboete {

    private String zone;


    // Constructor
    public ParkeerBoete (String naam, String kenteken, String zone) {

        setNaamDader(naam);
        setKenteken(kenteken);
        setZone(zone);
    }

    public void bepaalBedrag(String zone) {
        double bedrag;

        if (zone.equals("1")) {
            bedrag = 60;
        } else if (zone.equals("2")) {
            bedrag = 100;
        } else {
            bedrag = 180;
        }
        setBedrag(bedrag);
    }


    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public String toString(String naam, String kenteken, double bedrag, String zone) {
        return ("Parkeerboete voor " + naam + ", kenteken " + kenteken + ", " + bedrag + " euro in zone " + zone + ". ");
    }
}
