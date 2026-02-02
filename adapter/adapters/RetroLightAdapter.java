package patterns.adapter.adapters;
import patterns.adapter.adaptees.RetroLight;
import patterns.adapter.interfaces.SmartDevice;

public class RetroLightAdapter implements SmartDevice {
    RetroLight retroLight;

    public RetroLightAdapter(RetroLight retroLight) {
        this.retroLight = retroLight;
    }

    @Override
    public void turnOn() {
        retroLight.flickSwitch(true);
    }

    @Override
    public void turnOff() {
        retroLight.flickSwitch(false);
    }

    @Override
    public void setBrightness(int level) {
        retroLight.rotateKnob(level);
    }
}
