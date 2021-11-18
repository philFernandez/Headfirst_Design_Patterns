public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade system = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(),
                new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        system.watchMovie("Beavis and Butthead do America");
    }

}