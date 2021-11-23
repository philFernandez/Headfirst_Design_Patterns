
public class Driver {
    public static void main(String[] args) {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        var dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (var i = 0; i < breakfastItems.size(); i++) {
            var menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (var i = 0; i < lunchItems.length; i++) {
            var menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}