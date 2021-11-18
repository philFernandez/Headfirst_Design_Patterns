public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade system = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(),
                new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        system.watchMovie("Beavis and Butthead do America");
        sep('>', 75);
        system.endMovie();
    }

    public static void sep(char c, int n) {
        for (var i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}