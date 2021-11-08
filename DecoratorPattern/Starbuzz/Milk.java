public class Milk extends CondimentDecorator {

    public Milk(Beverage bev) {
        setBeverage(bev);
    }

    @Override
    public String getDescription() {
        return String.format("%s with Milk: %.2f", getBeverage().getDescription(), cost());
    }

    @Override
    public float cost() {
        return 1.29f + getBeverage().cost();
    }

}
