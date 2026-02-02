package patterns.adapter.adaptees;

public class RetroLight {
    public void flickSwitch(boolean upward) {
        if (upward) {
            System.out.println("RetroLight is now glowing.");
        } else {
            System.out.println("RetroLight is dark.");
        }
    }

    public void rotateKnob(int position) {
        System.out.println("Setting RetroLight intensity to " + position + "/10");
    }
}
