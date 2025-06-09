package patterns.commandnewex.hardware;

public class DVDPlayer {
    private boolean dvdOn = false;
    private String currentDisc = "No disc";

    public void on() {
        System.out.println("Turning on DVD Player");
        dvdOn = true;
    }

    public void off() {
        System.out.println("Turning off DVD Player");
        dvdOn = false;
    }

    public void insertDisc(String disc) {
        System.out.println("Inserting disc: " + disc);
        this.currentDisc = disc;
    }

    public String checkStatus() {
        return dvdOn ? "DVD Player is ON (Disc: " + currentDisc + ")" : "DVD Player is OFF";
    }
}
