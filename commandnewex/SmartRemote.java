package patterns.commandnewex;
import patterns.commandnewex.commands.Command;
import java.util.Stack;

public class SmartRemote {
    Stack<Command> onCommands = new Stack<>();
    Stack<Command> offCommands = new Stack<>();

    public void pushAndActivate(Command onCommand, Command offCommand) {
        if (!onCommands.isEmpty() && !offCommands.isEmpty()) {
            Command currentOffCommand = offCommands.peek();
            currentOffCommand.execute();
        }

        onCommands.push(onCommand);
        offCommands.push(offCommand);

        onCommand.execute();
    }

    public void undo() {
        if (onCommands.isEmpty() && offCommands.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Command currentOffCommand = offCommands.pop();
        currentOffCommand.execute();

        onCommands.pop();

        if (!offCommands.isEmpty() && !onCommands.isEmpty()) {
            Command previousOnCommand = onCommands.peek();
            previousOnCommand.execute();
            return;
        }

        System.out.println("System returned to default state");
    }

    public void printStackInfo() {
        System.out.println(">>> Stack size: " + onCommands.size() + " commands in history");
        if (!onCommands.isEmpty()) {
            System.out.println(">>> Current active: " + onCommands.peek().getClass().getSimpleName());
        } else {
            System.out.println(">>> No active commands (default state)");
        }
    }
}
