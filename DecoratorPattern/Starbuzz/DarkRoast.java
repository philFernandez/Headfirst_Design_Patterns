public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast");
    }

    public DarkRoast(String desc) {
        setDescription("Dark Roast " + desc);
    }

    @Override
    public float cost() {
        return 0.99F;
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
