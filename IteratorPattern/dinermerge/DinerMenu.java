import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    MenuItem[] menuItems;
    int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Fakin (Fake Bacon) w/ lettuce tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon w/ lettuce tomato on whole wheat", true, 2.99);
        addItem("Soup of the Day", "Soup with a side of potato salad", true, 3.29);
        addItem("Hot Dog", "Hot Dog with your favorite toppings", true, 3.05);
        addItem("Hamburger", "Ground Beef", false, 5.29);
        addItem("Veggieburger", "Impossible Patty", true, 9.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full... Cannot add anymore items to the menu!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    @Override
    public String toString() {
        var s = "";
        for (var i = 0; i < numberOfItems; i++) {
            s += menuItems[i] + "\n";
        }
        return s;
    }

}
