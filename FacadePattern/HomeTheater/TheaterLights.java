public class TheaterLights {

    public void on() {
        System.out.println("Theater Lights are on");
    }

    public void off() {
        System.out.println("Theater Lights are off");
    }

    public void dim(int brightness) {
        System.out.println("Theater Lights are dimming. Level: " + brightness);
    }

    public String toString() {
        return "TheaterLights[ ]";
    }
}
