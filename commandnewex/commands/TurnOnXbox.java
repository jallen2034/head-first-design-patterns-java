package patterns.commandnewex.commands;
import patterns.commandnewex.hardware.Xbox;

public class TurnOnXbox implements Command {
    Xbox xbox;

    public TurnOnXbox(Xbox xbox) {
        this.xbox = xbox;
    }

    @Override
    public void execute() {
        System.out.println("--- Just the Xbox is being turned on (not rlly useful but ok man)! ---");
        xbox.on();
    }
}
