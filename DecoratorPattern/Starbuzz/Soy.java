public class Soy extends CondimentDecorator {

    public Soy(Beverage bev) {
        setBeverage(bev);
    }

    @Override
    public String getDescription() {
        return String.format("%s with Soy: %.2f", getBeverage().getDescription(), cost());
    }

    @Override
    public float cost() {
        return 0.15f + getBeverage().cost();
    }

}
