
public class JavaEnabledWaitress {
    public void printMenu() {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        var dinerMenu = new DinerMenu();
        var dinerMenuIterator = dinerMenu.createIterator();

        while (dinerMenuIterator.hasNext()) {
            MenuItem item = dinerMenuIterator.next();
            System.out.print(item.getName() + ". ");
            System.out.print(item.getPrice() + ". ");
            System.out.println(item.getDescription());
        }

    }
}
