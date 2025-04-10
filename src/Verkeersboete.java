public class Verkeersboete {

    private String naamDader;
    private String kenteken;
    private double bedrag;



    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public String getKenteken() {
        return kenteken;
    }

    public void setNaamDader(String naamDader) {
        this.naamDader = naamDader;
    }

    public String getNaamDader() {
        return naamDader;
    }

    public String toString(String naamDader, String kenteken, double bedrag) {
        return (naamDader + " met kenteken " + kenteken + " heeft als boete: " + bedrag);
    }
}
