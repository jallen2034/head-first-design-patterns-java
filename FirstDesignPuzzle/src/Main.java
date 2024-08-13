package patterns.FirstDesignPuzzle.src;

import patterns.FirstDesignPuzzle.src.characters.*;
import patterns.FirstDesignPuzzle.src.characters.Character;
import patterns.FirstDesignPuzzle.src.dialogue.DialogueAfterShootingGun;
import patterns.FirstDesignPuzzle.src.weapons.GunBehaviour;

public class Main {
    public static void main(String[] args) {
        int fightCount = 4;  // Number of times each character should fight

        // Create an array of characters.
        Character[] characters = {
            new Queen(),
            new Knight(),
            new Troll(),
            new King(),
        };

        for (Character character : characters) {
            character.display();
            for (int i = 0; i < fightCount; i++) {
                character.fight();
            }
            character.speak();
            System.out.println(); // Adding a line break between ducks for clarity.
        }

        // Change the behaviors of the king (last in the array) at runtime.
        Character king = characters[characters.length - 1];
        king.display();

        // We can upgrade him to a ASSAULT RIFLE! haha brrrr :D
        king.setWeaponBehaviour(new GunBehaviour());
        king.setSpeakBehaviour(new DialogueAfterShootingGun());

        // Make the King empty his AR-15's magazine 4 times.
        for (int i = 0; i < fightCount; i++) {
            king.fight();
        }

        // Make the king say something funny after shooting his gun.
        king.speak();
    }
}
