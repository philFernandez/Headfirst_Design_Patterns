public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();
        Veggies veggies[] = ingredientFactory.createVeggies();
        System.out.println(dough);
        System.out.println(sauce);
        System.out.println(cheese);
        for (Veggies veg : veggies) {
            System.out.println(veg);
        }
    }

}
