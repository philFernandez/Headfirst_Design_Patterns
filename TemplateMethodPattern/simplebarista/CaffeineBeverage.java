public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Water is boiling");
    }

    public void pourInCup() {
        System.out.println("Beverage is being poured");
    }

    public abstract void brew();

    public abstract void addCondiments();

    boolean wantsCondiments() {
        return true;
    }
}
