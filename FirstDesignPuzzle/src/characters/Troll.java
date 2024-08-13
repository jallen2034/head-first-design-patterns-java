package patterns.FirstDesignPuzzle.src.characters;

import patterns.FirstDesignPuzzle.src.weapons.AxeBehaviour;

public class Troll extends Character {
    public Troll() {
        weaponBehaviour = new AxeBehaviour();
    }

    // Displays the specific type of character here :)
    @Override
    public void display() {
        System.out.println("I'm a Troll >:(");
    }
}
