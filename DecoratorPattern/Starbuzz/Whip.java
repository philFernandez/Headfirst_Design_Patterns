public class Whip extends CondimentDecorator {

    public Whip(Beverage bev) {
        setBeverage(bev);
    }

    @Override
    public String getDescription() {
        return String.format("%s with Whip: %.2f", getBeverage().getDescription(), cost());
    }

    @Override
    public float cost() {
        return 0.10f + getBeverage().cost();
    }

}
