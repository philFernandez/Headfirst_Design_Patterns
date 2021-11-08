public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
    }

    public Decaf(String desc) {
        setDescription("Decaf " + desc);
    }

    @Override
    public float cost() {
        return 1.05F;
    }

    @Override
    public String toString() {
        return String.format("Decaf: %.2f", cost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" %.2f", cost());
    }

}
