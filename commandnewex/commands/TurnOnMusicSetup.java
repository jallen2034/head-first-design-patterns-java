package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOnMusicSetup implements Command {
    SoundSystem soundSystem;
    Television television;

    public TurnOnMusicSetup(SoundSystem soundSystem, Television television) {
        this.soundSystem = soundSystem;
        this.television = television;
    }

    @Override
    public void execute() {
        System.out.println("--- Time to rave to some music. ---");
        soundSystem.On();
        soundSystem.setVolume(60); //We like our music loud!
        television.on(); // For the trippy visualizations!
        television.setTvInput("HDMI 3"); // For music visualizations.
    }
}
