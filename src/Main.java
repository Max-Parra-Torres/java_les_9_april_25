public class Main {

    public static void main(String[] args) {

        String naam = "John Doe";
        String kenteken = "123-AB-45";
        int gemetenSnelheid = 130;
        int maxSnelheid = 80;
        String zone = "2";


// Instance of Snelheidsboete
        Snelheidsboete snelheidsboete = new Snelheidsboete(naam, kenteken, gemetenSnelheid, maxSnelheid);
        snelheidsboete.setBedrag(snelheidsboete.bepaalBedrag(gemetenSnelheid, maxSnelheid));
        System.out.println(snelheidsboete.toString(
                naam, kenteken, snelheidsboete.getBedrag(), gemetenSnelheid, maxSnelheid
        ));

// Instance of ParkeerBoete
        ParkeerBoete parkeerBoete = new ParkeerBoete(naam, kenteken, zone);
        parkeerBoete.bepaalBedrag(zone);
        System.out.println(parkeerBoete.toString(
                naam, kenteken, parkeerBoete.getBedrag(), zone
        ));
    }
}