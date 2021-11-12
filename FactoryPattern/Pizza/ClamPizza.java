public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        Dough dough = ingredientFactory.createDough();
        System.out.println(dough);
        Sauce sauce = ingredientFactory.createSauce();
        System.out.println(sauce);
        Cheese cheese = ingredientFactory.createCheese();
        System.out.println(cheese);
        Clams clams = ingredientFactory.createClams();
        System.out.println(clams);
    }

}
