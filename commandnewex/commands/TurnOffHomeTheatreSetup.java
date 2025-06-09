package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.DVDPlayer;
import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOffHomeTheatreSetup implements Command {
    SoundSystem soundSystem;
    Television television;
    DVDPlayer dvdPlayer;

    public TurnOffHomeTheatreSetup(DVDPlayer dvdPlayer, SoundSystem soundSystem, Television television) {
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.television = television;
    }

    @Override
    public void execute() {
        System.out.println("--- Time to stop watching movies. ---");
        soundSystem.Off();
        soundSystem.setVolume(0); // Back to default.
        television.off();
        television.setTvInput("HDMI 1"); // Back to default.
    }
}

