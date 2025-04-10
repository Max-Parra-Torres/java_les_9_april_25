public class Snelheidsboete extends Verkeersboete {

    private int gemetenSnelheid;
    private int maximumSnelheid;

    // Constructor
    public Snelheidsboete (String naam, String kenteken, int gemetenSnelheid, int maximumSnelheid) {

        setNaamDader(naam);
        setKenteken(kenteken);
        setGemetenSnelheid(gemetenSnelheid);
        setMaximumSnelheid(maximumSnelheid);
    }


    public double bepaalBedrag(int gemetenSnelheid, int maximumSnelheid) {
        double bedrag;
        double kmhTeVeel = gemetenSnelheid % maximumSnelheid;

        if (kmhTeVeel > 0 && kmhTeVeel <= 10) {
            bedrag = kmhTeVeel * 10;
        } else if (kmhTeVeel > 10 && kmhTeVeel <= 30) {
            bedrag = kmhTeVeel * 15;
        } else {
            bedrag = kmhTeVeel * 20;
        }
        return bedrag;
    }


    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public String toString(String naam, String kenteken, double bedrag, int gemetenSnelheid, int maximumSnelheid) {
        return ("Snelheidsboete voor " + naam + ", kenteken " + kenteken + ", " + bedrag + " euro voor " + gemetenSnelheid + " km/u waar " + maximumSnelheid + " km/u is toegestaan.");
    }
}
