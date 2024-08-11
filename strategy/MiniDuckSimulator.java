package patterns.strategy;

import patterns.strategy.behaviours.FlyRocketPowered;
import patterns.strategy.ducks.Duck;
import patterns.strategy.ducks.MallardDuck;
import patterns.strategy.ducks.ModelDuck;
import patterns.strategy.ducks.RubberDuck;
import patterns.strategy.quack.MuteQuack;

/* Main class and entry point for our Duck Simulator program. This demonstrates
 * the Strategy Pattern by allowing the ducks to change their behaviors at runtime. */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Create an array of Duck objects, each representing a different type of Duck we want to create.
        Duck[] ducks = {
            new MallardDuck(),
            new RubberDuck(),
            new ModelDuck()
        };

        // Loop through each Duck and demonstrate its behaviors.
        for (Duck duck : ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
            duck.swim();
            System.out.println(); // Adding a line break between ducks for clarity.
        }

        // Change the behaviors of the ModelDuck (last in the array) at runtime.
        Duck modelDuck = ducks[ducks.length - 1];
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new MuteQuack());

        // Do stuff on the duck now modified at runtime.
        modelDuck.display();
        modelDuck.performQuack(); // << silence >>
        modelDuck.performFly(); // I'm flying with a rocket!
    }
}
