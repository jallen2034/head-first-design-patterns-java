package patterns.FirstDesignPuzzle.src.characters;

import patterns.FirstDesignPuzzle.src.weapons.KnifeBehaviour;

public class King extends Character  {
    // Constructor sets the behavior for a King
    public King() {
        weaponBehaviour = new KnifeBehaviour();
    }

    @Override
    public void display() {
        System.out.println("I'm a King 8==D");
    }
}
