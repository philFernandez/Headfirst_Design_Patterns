
public class Driver {
    public static void main(String[] args) {
        var waitress = new JavaEnabledWaitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        waitress.printMenu();
    }
}