package patterns.commandnewex;
import patterns.commandnewex.commands.*;
import patterns.commandnewex.hardware.*;


public class Main {
    public static void main(String[] args) {
        // Create our smart remote invoker.
        SmartRemote universalMediaRemote = new SmartRemote();

        // Create instances of our hardware (receivers).
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem("Stereo");
        Xbox xbox = new Xbox();
        Television television = new Television();
        Lights lights = new Lights();

        System.out.println("=== Testing Stack-Based Command History ===\n");

        // Test 1: Gaming Setup.
        System.out.println("1. Activating Gaming Setup...");
        universalMediaRemote.pushAndActivate(
                new TurnOnGamingSetup(xbox, television, soundSystem),
                new TurnOffGamingSetup(xbox, television, soundSystem)
        );
        universalMediaRemote.printStackInfo();

        // Test 2: Switch to Music Setup.
        System.out.println("\n2. Switching to Music Setup...");
        universalMediaRemote.pushAndActivate(
                new TurnOnMusicSetup(soundSystem, television),
                new TurnOffMusicSetup(soundSystem, television)
        );
        universalMediaRemote.printStackInfo();

        // Test 3: Switch to Movie Night.
        System.out.println("\n3. Switching to Movie Night Setup...");
        universalMediaRemote.pushAndActivate(
                new TurnOnMovieNightSetup(television, soundSystem, lights),
                new TurnOffMovieNightSetup(television, soundSystem, lights)
        );
        universalMediaRemote.printStackInfo();

        // Test 4: Undo back to Music.
        System.out.println("\n4. Undo to previous setup...");
        universalMediaRemote.undo();
        universalMediaRemote.printStackInfo();

        // Test 5: Undo back to Gaming.
        System.out.println("\n5. Undo to previous setup...");
        universalMediaRemote.undo();
        universalMediaRemote.printStackInfo();

        // Test 6: Undo to default state.
        System.out.println("\n6. Undo to default state...");
        universalMediaRemote.undo();
        universalMediaRemote.printStackInfo();

        // Test 7: Try to undo when empty.
        System.out.println("\n7. Try to undo when nothing left...");
        universalMediaRemote.undo();
        universalMediaRemote.printStackInfo();
    }
}