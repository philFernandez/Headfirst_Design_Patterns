public class DarkRoast extends Beverage {

    public DarkRoast() {
    }

    public DarkRoast(String descr) {
        setDescription(descr);
    }

    @Override
    public float cost() {
        // Dark Roast cost 4.99
        return 4.99F;
    }

    @Override
    public String toString() {
        return String.format("Dark Roast: %.2f", cost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" %.2f", cost());
    }

}
