public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setStreamingPlayer() {
        System.out.println("Streaming Player is set in Amplifier");
    }

    public void setStereoSound() {
        System.out.println("Stereo Sound is set in Amplifier");
    }

    public void setSurroundSound() {
        System.out.println("Surround Sound is set in Amplifier");
    }

    public void setTuner() {
        System.out.println("Tuner is set in Amplifier");
    }

    public void setVolume() {
        System.out.println("Volume is set in Amplifier");
    }

    public String toString() {
        return "Amplifier[ tuner: " + this.tuner + " ]";
    }
}
