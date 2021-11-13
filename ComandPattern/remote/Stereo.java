public class Stereo {

    private int volume;
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for radio input");
    }

    public void setVolume(int vol) {
        if (vol > 10) {
            vol = 10;
        } else if (vol < 0) {
            vol = 0;
        }
        volume = vol;
        System.out.println(location + " stereo volume is set to " + volume);
    }

    public int getVolume() {
        return volume;
    }

}
