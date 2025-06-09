package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;
import patterns.commandnewex.hardware.Xbox;

public class TurnOnGamingSetup implements Command {
    Xbox xbox;
    Television television;
    SoundSystem soundSystem;

    public TurnOnGamingSetup(Xbox xbox, Television television, SoundSystem soundSystem) {
        this.xbox = xbox;
        this.television = television;
        this.soundSystem = soundSystem;
    }

    @Override
    public void execute() {
        System.out.println("--- ITS Gaming TIME! ---");
        xbox.on();
        xbox.setGame("Halo 3"); // My favourite game.
        television.on();
        television.setTvInput("HDMI 2"); // Let's say HDMI 2 is for the Xbox.
        soundSystem.On();
        soundSystem.setVolume(45); // HALO NEEDS TO BE LOUD
        soundSystem.setAudioMode("Surround"); // Halo support surround sound for best gaming experience.
    }
}
