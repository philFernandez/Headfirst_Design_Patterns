public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    public Espresso(String desc) {
        setDescription("Espresso " + desc);
    }

    @Override
    public float cost() {
        return 1.99F;
    }

    @Override
    public String toString() {
        return String.format("Espresso: %.2f", cost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" %.2f", cost());
    }
}
