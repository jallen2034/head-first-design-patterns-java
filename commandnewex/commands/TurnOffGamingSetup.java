package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;
import patterns.commandnewex.hardware.Xbox;

public class TurnOffGamingSetup implements Command {
    Xbox xbox;
    Television television;
    SoundSystem soundSystem;

    public TurnOffGamingSetup(Xbox xbox, Television television, SoundSystem soundSystem) {
        this.xbox = xbox;
        this.television = television;
        this.soundSystem = soundSystem;
    }

    @Override
    public void execute() {
        System.out.println("--- Time to go to sleep no more Xbox. ---");
        xbox.off();
        xbox.setGame(""); // Remove game
        television.off();
        television.setTvInput("HDMI 1"); // Let's say HDMI 1 is the default.
        soundSystem.Off();
        soundSystem.setVolume(0); // Back to nothing.
    }
}
