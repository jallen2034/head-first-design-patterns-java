package patterns.commandnewex;

import patterns.commandnewex.commands.Command;
import patterns.commandnewex.commands.NoOpCommand;

public class SmartRemote {
    Command[] onCommands;
    Command[] offCommands;

    int slots = 5;

    public SmartRemote() {
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        // Null guard checks.
        for (int i = 0; i < slots; i++) {
            onCommands[i] = new NoOpCommand();
            offCommands[i] = new NoOpCommand();
        }
    }

    // Load our desired commands into our slots.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (onCommand == null || offCommand == null) {
            throw new NullPointerException("onCommand or offCommand is null");
        } else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void activateSlot(int slot) {
        onCommands[slot].execute();
    }

    public void deactivateSlot(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- Media Remote Controller --------\n");
        for (int i = 0; i < slots; i++) {
            sb.append("Slot #" + i + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands[i].getClass().getSimpleName() + ")" +
                    " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands[i].getClass().getSimpleName() + ")" +
                    "\n");
        }
        return sb.toString();
    }
}
