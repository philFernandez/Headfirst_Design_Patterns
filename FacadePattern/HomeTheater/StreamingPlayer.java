public class StreamingPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("Streaming player is on");
    }

    public void off() {
        System.out.println("Streaming player is off");
    }

    public void pause() {
        System.out.println("Streaming player is paused");
    }

    public void play(String media) {
        System.out.println("Streaming player is playing \"" + media + "\"");
    }

    public void stop() {
        System.out.println("Streaming player is stopped");
    }

    public void setSurroundAudio() {
        System.out.println("Surround audio set on streaming player");
    }

    public void setTwoChannelAudio() {
        System.out.println("Two channel audio set on streaming player");
    }

    public String toString() {
        return "StreamingPlayer[ amplifier: " + this.amplifier + " ]";
    }
}
