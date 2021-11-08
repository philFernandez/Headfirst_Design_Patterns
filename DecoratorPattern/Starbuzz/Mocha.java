public class Mocha extends CondimentDecorator {

    public Mocha(Beverage bev) {
        setBeverage(bev);
    }

    @Override
    public String getDescription() {
        return "Mocha Added";
    }

    @Override
    public float cost() {
        return 1.99f + getBeverage().cost();
    }

    @Override
    public String toString() {
        return String.format("%s with Mocha: %.2f", getBeverage(), cost());
    }

}
