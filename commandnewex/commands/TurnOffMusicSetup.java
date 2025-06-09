package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOffMusicSetup implements Command {
    SoundSystem soundSystem;
    Television television;

    public TurnOffMusicSetup(SoundSystem soundSystem, Television television) {
        this.soundSystem = soundSystem;
        this.television = television;
    }

    @Override
    public void execute() {
        System.out.println("--- Time to turn the music off :). ---");
        soundSystem.Off();
        soundSystem.setVolume(0); //We like our music loud!
        television.setTvInput("HDMI 1"); // Back to Default
        television.off();
    }
}
