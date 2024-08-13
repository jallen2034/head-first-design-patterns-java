package patterns.FirstDesignPuzzle.src.characters;

import patterns.FirstDesignPuzzle.src.dialogue.SpeakBehaviour;
import patterns.FirstDesignPuzzle.src.weapons.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    SpeakBehaviour speakBehaviour;

    // Method we can use to update the weapon behaviour on the fly.
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
        this.speakBehaviour = speakBehaviour;
    }

    // Abstract method to be implemented by subclasses to display a specific type of Duck.
    public abstract void display();

    // Method we call on the concrete class/strategy currently in weaponBehaviour to use the weapon.
    public void fight() {
        if (weaponBehaviour != null) {
            weaponBehaviour.useWeapon();
        }
    }

    public void speak() {
        if (speakBehaviour != null) {
            speakBehaviour.speak();
        }
    }
}
