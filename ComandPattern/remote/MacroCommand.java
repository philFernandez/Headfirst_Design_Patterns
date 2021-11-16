
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (var i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (var i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }

    @Override
    public String toString() {
        return "MacroCommand";
    }

}
