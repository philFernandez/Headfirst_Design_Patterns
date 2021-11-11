public abstract class PizzaStore {

    // Made final so all PizzaStore subclasses will be forced to use this
    // implementation and not override.
    final public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
