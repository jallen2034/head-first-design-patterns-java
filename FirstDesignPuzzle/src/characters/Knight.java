package patterns.FirstDesignPuzzle.src.characters;

import patterns.FirstDesignPuzzle.src.weapons.SwordBehaviour;

public class Knight extends Character {
    public Knight() {
        weaponBehaviour = new SwordBehaviour();
    }

    // Displays the specific type of character here :)
    @Override
    public void display() {
        System.out.println("I'm a Knight >:|");
    }
}
