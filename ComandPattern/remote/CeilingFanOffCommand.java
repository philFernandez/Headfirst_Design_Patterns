public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
        case CeilingFan.HIGH:
            ceilingFan.high();
            break;
        case CeilingFan.MEDIUM:
            ceilingFan.medium();
            break;
        case CeilingFan.LOW:
            ceilingFan.low();
            break;
        case CeilingFan.OFF:
            ceilingFan.off();
        }
    }

    @Override
    public String toString() {
        return "CeilingFanOffCommand";
    }

}
