package patterns.FirstDesignPuzzle.src.weapons;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    int arrowsLeft = 10;

    public void useWeapon() {
        System.out.println("I am shooting a bow");
        arrowsLeft -= 1;
        System.out.println("I have " + arrowsLeft + " shots left in my quiver");
    }
}
