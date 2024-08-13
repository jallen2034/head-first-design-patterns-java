package patterns.FirstDesignPuzzle.src.characters;

import patterns.FirstDesignPuzzle.src.weapons.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen() {
        weaponBehaviour = new BowAndArrowBehaviour();
    }

    // Displays the specific type of character here :)
    @Override
    public void display() {
        System.out.println("I'm a Queen ;)");
    }
}
