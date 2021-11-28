import java.util.Iterator;
import java.util.List;

public class JavaEnabledWaitress {

    List<Menu> menus;

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public JavaEnabledWaitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.forEach(menu -> printMenu(menu.createIterator()));
    }

    private void printMenu(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            var item = it.next();
            System.out.print(item.getName() + ". ");
            System.out.print(item.getPrice() + ". ");
            System.out.println(item.getDescription());
        }
    }
}
