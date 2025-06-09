package patterns.commandnewex.hardware;

public class Television {
    private boolean tvOn = false;
    private String tvInput = "HDMI 1";

    public String getTvInput() {
        return tvInput;
    }

    public String checkIfTvIsOn() {
        return tvOn ? "The TV is ON (Input: " + tvInput + ")" : "The TV is OFF";
    }

    public void setTvInput(String tvInput) {
        System.out.println("Setting the TV input to " + tvInput);
        this.tvInput = tvInput;
    }

    public void on() {
        System.out.println("Turning on The TV");
        tvOn = true;
    }

    public void off() {
        System.out.println("Turning off The TV");
        tvOn = false;
    }
}
