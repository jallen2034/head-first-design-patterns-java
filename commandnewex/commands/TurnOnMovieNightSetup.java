package patterns.commandnewex.commands;

import patterns.commandnewex.hardware.Lights;
import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;

public class TurnOnMovieNightSetup implements Command {
    Television television;
    SoundSystem soundSystem;
    Lights lights;

    public TurnOnMovieNightSetup(Television television, SoundSystem soundSystem, Lights lights) {
        this.television = television;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println("---Its time for a late movie night, break out the popcorn!");
        television.on();
        lights.on();
        soundSystem.On();
    }
}
