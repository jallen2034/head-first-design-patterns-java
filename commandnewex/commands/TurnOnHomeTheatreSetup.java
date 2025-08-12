package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.DVDPlayer;
import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOnHomeTheatreSetup implements Command {
    SoundSystem soundSystem;
    Television television;
    DVDPlayer dvdPlayer;

    public TurnOnHomeTheatreSetup(DVDPlayer dvdPlayer, SoundSystem soundSystem, Television television) {
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.television = television;
    }

    @Override
    public void execute() {
        System.out.println("--- Time to get the popcorn :). ---");
        soundSystem.On();
        soundSystem.setVolume(50); //We like our movies kinda loud but not too loud.
        television.on();
        television.setTvInput("HDMI 4"); // HDMI 4 is for the DVD player.
    }
}
