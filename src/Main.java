public class Main {

    public static void main(String[] args) {

        String naam = "John Doe";
        String kenteken = "123-AB-45";
        int gemetenSnelheid = 130;
        int maxSnelheid = 80;
        String zone = "2";


        // Instance of Snelheidsboete
        Snelheidsboete snelheidsboete = new Snelheidsboete(naam, kenteken, gemetenSnelheid, maxSnelheid);
        double snelheidsboeteBedrag = snelheidsboete.bepaalBedrag(snelheidsboete.getGemetenSnelheid(), snelheidsboete.getMaximumSnelheid());
        snelheidsboete.setBedrag(snelheidsboeteBedrag);
        System.out.println(snelheidsboete.toString(
                snelheidsboete.getNaamDader(),
                snelheidsboete.getKenteken(),
                snelheidsboete.getBedrag(),
                snelheidsboete.getGemetenSnelheid(),
                snelheidsboete.getMaximumSnelheid()
        ));

        // Instance of ParkeerBoete
        ParkeerBoete parkeerBoete = new ParkeerBoete(naam, kenteken, zone);
        parkeerBoete.bepaalBedrag(zone);
        System.out.println(parkeerBoete.toString(
                parkeerBoete.getNaamDader(),
                parkeerBoete.getKenteken(),
                parkeerBoete.getBedrag(),
                parkeerBoete.getZone()
        ));
    }
}
