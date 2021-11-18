public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector,
            TheaterLights lights, Screen screen, PopcornPopper popper) {

        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    @Override
    public String toString() {
        return "HomeTheaterFacade [amp=" + amp + ", lights=" + lights + ", player=" + player + ", popper=" + popper
                + ", projector=" + projector + ", screen=" + screen + ", tuner=" + tuner + "]";
    }

}
