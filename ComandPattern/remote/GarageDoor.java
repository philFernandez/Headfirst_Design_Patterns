public class GarageDoor {

    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " door is up");
    }

    public void down() {
        System.out.println(location + " door is down");
    }
}
