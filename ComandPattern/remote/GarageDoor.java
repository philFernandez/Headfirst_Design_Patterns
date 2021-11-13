public class GarageDoor {

    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage door is up");
    }

    public void down() {
        System.out.println("Garage door is down");
    }
}
