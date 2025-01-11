package patterns.observer.displayFactory.store;

import patterns.observer.displayFactory.displays.Display;

public abstract class DisplayStore {
    // Template method to manage the creation and registration of displays.
    public Display orderDisplay(String type) {
        Display display = createDisplay(type);

        if (display == null) {
            throw new IllegalArgumentException("Display type not supported: " + type);
        }

        return display;
    }

    // Abstract method for creating specific display types.
    protected Display createDisplay(String type) {
        return null;
    }
}
