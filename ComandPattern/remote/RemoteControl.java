import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    // Command undoCommand;
    Stack<Command> commandHistory;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (var i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        // undoCommand = noCommand;
        commandHistory = new Stack<Command>();

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // undoCommand = onCommands[slot];
        commandHistory.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        // undoCommand = offCommands[slot];
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        Command undoCommand = commandHistory.pop();
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");

        for (var i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i] + "      " + offCommands[i] + "\n");
        }
        stringBuff.append("[undo] " + commandHistory + "\n");

        return stringBuff.toString();
    }
}