public class Main {

    public static void main(String[] args) {

        // Instance of Snelheidsboete
        int maxSnelheid = 80;
        Snelheidsboete snelheidsboete = new Snelheidsboete("John Doe", "123-AB-45", 130, maxSnelheid);
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
        ParkeerBoete parkeerBoete = new ParkeerBoete("Jane Smith", "456-CD-78", "Zone 2");
        parkeerBoete.bepaalBedrag(2);
        System.out.println(parkeerBoete.toString(
                parkeerBoete.getNaamDader(),
                parkeerBoete.getKenteken(),
                parkeerBoete.getBedrag(),
                parkeerBoete.getZone()
        ));
    }
}
