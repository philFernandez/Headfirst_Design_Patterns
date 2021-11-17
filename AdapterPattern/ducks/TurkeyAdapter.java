public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Ducks can fly ~5 times further than turkey's
        for (var i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}
