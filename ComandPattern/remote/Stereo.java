public class Stereo {

    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("CD is selected");
    }

    public void setDvd() {
        System.out.println("DVD is selected");
    }

    public void setRadio() {
        System.out.println("Radio is selected");
    }

    public void setVolume(int vol) {
        if (vol > 10) {
            vol = 10;
        } else if (vol < 0) {
            vol = 0;
        }
        volume = vol;
    }

    public int getVolume() {
        return volume;
    }

}
