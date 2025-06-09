package patterns.commandnewex.hardware;

public class Xbox {
    private boolean xboxOn = false;
    private String currentGame = "Dashboard";

    public void on() {
        System.out.println("Turning on Xbox");
        xboxOn = true;
    }

    public void off() {
        System.out.println("Turning off Xbox");
        xboxOn = false;
    }

    public void setGame(String game) {
        System.out.println("Loading game: " + game);
        this.currentGame = game;
    }

    public String checkStatus() {
        return xboxOn ? "Xbox is ON (Game: " + currentGame + ")" : "Xbox is OFF";
    }
}
