package patterns.factory.standard.pizza;

// Our top level entity pizza abstract class. Subclasses must define these methods for program to compile!
public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
