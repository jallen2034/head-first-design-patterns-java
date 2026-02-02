package patterns.adapter;
import patterns.adapter.adaptees.RetroLight;
import patterns.adapter.adapters.RetroLightAdapter;
import patterns.adapter.interfaces.SmartDevice;

public class Main {
    public static void main(String[] args) {
        // 1. Create the legacy object (The Adaptee).
        RetroLight oldLight = new RetroLight();

        // 2. Wrap it in your adapter (The Adapter).
        SmartDevice adapter = new RetroLightAdapter(oldLight);

        System.out.println("--- Testing the Adapter ---");

        // 3. Use the adapter via the SmartDevice interface :)
        adapter.turnOn();
        adapter.setBrightness(50);
        adapter.setBrightness(100);
        adapter.turnOff();
    }
}