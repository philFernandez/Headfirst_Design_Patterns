public class Tuner {
    Amplifier amplifier;

    public void on() {
        System.out.println("Tuner on");
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setAm() {
        System.out.println("AM is set in tuner");
    }

    public void setFm() {
        System.out.println("FM is set in tuner");
    }

    public void setFrequency() {
        System.out.println("Tuner frequency is set");
    }

    public String toString() {
        return "Tuner[ amplifier: " + this.amplifier + " ]";
    }
}
