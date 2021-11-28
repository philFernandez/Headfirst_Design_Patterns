import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        var menus = new ArrayList<Menu>();
        Collections.addAll(menus, new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        var waitress = new JavaEnabledWaitress(menus);
        waitress.printMenu();
    }
}