package patterns.observer.subject;
import patterns.observer.observers.Update;

public interface Subject {
    public void registerObserver(Update observer);
    public void removeObserver(Update observer);
    public void notifyObservers();
}
