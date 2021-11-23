
public class JavaEnabledWaitress {
    public void printMenu() {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

        var dinerMenu = new DinerMenu();
        var dinerMenuIterator = dinerMenu.createIterator();

        while (dinerMenuIterator.hasNext()) {
            MenuItem item = dinerMenuIterator.next();
            System.out.print(item.getName() + ". ");
            System.out.print(item.getPrice() + ". ");
            System.out.println(item.getDescription());
        }
        while (pancakeHouseMenuIterator.hasNext()) {
            MenuItem item = pancakeHouseMenuIterator.next();
            System.out.print(item.getName() + ". ");
            System.out.print(item.getPrice() + ". ");
            System.out.println(item.getDescription());
        }

    }
}
