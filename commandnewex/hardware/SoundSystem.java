package patterns.commandnewex.hardware;

public class SoundSystem {
    private boolean soundSystemOn = false;
    private int volume = 20;
    private String audioMode;

    public SoundSystem(String audioMode) {
        this.audioMode = audioMode;
    }

    public String checkIfSoundSystemOn() {
        return soundSystemOn ? "The Sound System is ON (volume: " + volume + ")" : "The Sound System is OFF";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getAudioMode() {
        return audioMode;
    }

    public void setAudioMode(String audioMode) {
        this.audioMode = audioMode;
    }

    public void On() {
        System.out.println("Turning on The Sound System");
        soundSystemOn = true;
    }
    public void Off() {
        System.out.println("Turning off The Sound System");
        soundSystemOn = false;
    }
}
