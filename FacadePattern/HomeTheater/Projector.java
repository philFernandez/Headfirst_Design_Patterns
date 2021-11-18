public class Projector {
    StreamingPlayer player;

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void tvMode() {
        System.out.println("Projector in TV Mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector in Wide Screen Mode");
    }

    public String toString() {
        return "Projector[ player: " + this.player + " ]";
    }
}
