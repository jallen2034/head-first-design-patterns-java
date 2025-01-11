package patterns.observer.displayFactory.displays;

public abstract class Display {
    public abstract void update(float temperature, float humidity, float pressure);
    public abstract void display();
}
