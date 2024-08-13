package patterns.FirstDesignPuzzle.src.weapons;

public class GunBehaviour implements WeaponBehaviour {
    int ammoLeft = 120;

    public void useWeapon() {
        System.out.println("I am shooting a AR-15 magazine!");
        ammoLeft -= 30;
        System.out.println("I have " + ammoLeft + " shots left in my ammo pouch");
    }
}
