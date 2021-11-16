public class NoCommand implements Command {

    @Override
    public void execute() {
        // DO NOTHING
    }

    @Override
    public void undo() {
        // DO NOTHING
    }

    @Override
    public String toString() {
        return "NoCommand";
    }
}
