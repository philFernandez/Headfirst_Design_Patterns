import java.util.Iterator;

public class JavaEnabledWaitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public JavaEnabledWaitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        printMenu(dinerMenu.createIterator());
        System.out.println("\nDINNER");
        printMenu(cafeMenu.createIterator());
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
