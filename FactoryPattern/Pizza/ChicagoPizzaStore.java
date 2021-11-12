public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(Pizza.PizzaType type) {
        if (type == Pizza.PizzaType.CHEESE) {
            return new ChicagoStyleCheesePizza();
        } else if (type == Pizza.PizzaType.VEGGIE) {
            return new ChicagoStyleVeggiePizza();
        } else if (type == Pizza.PizzaType.CLAM) {
            return new ChicagoStyleClamPizza();
        }

        return null;
    }

}
