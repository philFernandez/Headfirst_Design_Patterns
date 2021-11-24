
public class JavaEnabledWaitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public JavaEnabledWaitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        printMenu(dinerMenu.createIterator());
    }

    private void printMenu(Iterator it) {
        while (it.hasNext()) {
            var item = it.next();
            System.out.print(item.getName() + ". ");
            System.out.print(item.getPrice() + ". ");
            System.out.println(item.getDescription());
        }
    }
}
