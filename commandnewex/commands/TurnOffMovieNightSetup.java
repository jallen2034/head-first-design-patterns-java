package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.Lights;
import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOffMovieNightSetup implements Command {
    Television television;
    SoundSystem soundSystem;
    Lights lights;

    public TurnOffMovieNightSetup(Television television, SoundSystem soundSystem, Lights lights) {
        this.television = television;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println("---All done time for bed!");
        television.off();
        lights.off();
        soundSystem.Off();
    }
}