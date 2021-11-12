public class Singleton {
    private static Singleton instance = null;
    private int state;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}