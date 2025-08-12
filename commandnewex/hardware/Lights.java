package patterns.commandnewex.hardware;

public class Lights {
    private boolean lightsOn = false;

    public void on() {
        System.out.println("Light on");
        lightsOn = true;
    }

    public void off() {
        System.out.println("Light off");
        lightsOn = false;
    }
}
