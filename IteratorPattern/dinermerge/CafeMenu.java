import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a bun, lettuce , tomato and fries", true, 3.99);
        addItem("Soup of the Day", "Soup and Salad", false, 3.69);
        addItem("Burrito", "Burrito with salsa, guacamole, pinto beans", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}

/*
 * 1) Implement Menu
 * 2) Create Iterator
 * 3) Obfuscate menuItems (get rid of getMenuItems)
 */