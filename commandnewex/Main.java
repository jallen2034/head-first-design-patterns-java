package patterns.commandnewex;
import patterns.commandnewex.commands.*;
import patterns.commandnewex.hardware.DVDPlayer;
import patterns.commandnewex.hardware.SoundSystem;
import patterns.commandnewex.hardware.Television;
import patterns.commandnewex.hardware.Xbox;

class CommandSetup {
    int slot;
    Command onCommand;
    Command offCommand;
    String description;

    public CommandSetup(int slot, Command onCommand, Command offCommand, String description) {
        this.slot = slot;
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.description = description;
    }
}

public class Main {
    public static void main(String[] args) {
        final int GamingSetupCommandSlot = 1;
        final int MusicSetupCommandSlot = 2;
        final int HomeTheatreSetupCommandSlot = 3;

        // Create our smart remote invoker.
        SmartRemote universalMediaRemote = new SmartRemote();

        // Create instances of our hardware or receivers.
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem("Stero");
        Xbox xbox = new Xbox();
        Television television = new Television();

        CommandSetup[] commandSetups = {
                new CommandSetup(GamingSetupCommandSlot,
                        new TurnOnGamingSetup(xbox, television, soundSystem),
                        new TurnOffGamingSetup(xbox, television, soundSystem),
                        "Gaming"),
                new CommandSetup(MusicSetupCommandSlot,
                        new TurnOnMusicSetup(soundSystem, television),
                        new TurnOffMusicSetup(soundSystem, television),
                        "Music"),
                new CommandSetup(HomeTheatreSetupCommandSlot,
                        new TurnOnHomeTheatreSetup(dvdPlayer, soundSystem, television),
                        new TurnOffHomeTheatreSetup(dvdPlayer, soundSystem, television),
                        "Home Theatre")
        };

        // Set up all commands.
        for (CommandSetup commandSetup : commandSetups) {
            universalMediaRemote.setCommand(commandSetup.slot, commandSetup.onCommand, commandSetup.offCommand);
        }

        System.out.println(universalMediaRemote);

        // Test all commands.
        for (CommandSetup setup : commandSetups) {
            System.out.println("\n=== Testing " + setup.description + " Setup ===");
            universalMediaRemote.activateSlot(setup.slot);
            universalMediaRemote.deactivateSlot(setup.slot);
        }
    }
}
