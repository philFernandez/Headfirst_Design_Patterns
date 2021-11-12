public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Pizza.PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n\n");
        pizza = chicagoStore.orderPizza(Pizza.PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n\n");

    }
}
