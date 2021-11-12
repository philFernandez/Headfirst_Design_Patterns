
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(Pizza.PizzaType type) {
        if (type == Pizza.PizzaType.CHEESE) {
            return new NYStyleCheesePizza();
        } else if (type == Pizza.PizzaType.VEGGIE) {
            return new NYStyleVeggiePizza();
        } else if (type == Pizza.PizzaType.CLAM) {
            return new NYStyleClamPizza();
        }

        return null;
    }

}
