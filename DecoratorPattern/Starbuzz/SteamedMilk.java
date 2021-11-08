public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage bev) {
        setBeverage(bev);
    }

    @Override
    public String getDescription() {
        return String.format("%s with Milk: %.2f", getBeverage().getDescription(), cost());
    }

    @Override
    public float cost() {
        return 0.10f + getBeverage().cost();
    }

}
