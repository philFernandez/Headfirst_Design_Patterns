public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    public HouseBlend(String desc) {
        setDescription("House Blend " + desc);
    }

    @Override
    public float cost() {
        return 0.89F;
    }

    @Override
    public String toString() {
        return String.format("House Blend: %.2f", cost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" %.2f", cost());
    }

}
