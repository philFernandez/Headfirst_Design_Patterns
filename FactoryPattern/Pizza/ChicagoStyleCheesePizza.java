public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void bake() {
        System.out.println("Bake for 40 minutes at 425");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
