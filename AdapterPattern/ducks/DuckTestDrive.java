public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        testTurkey(turkey);
        sep();

        System.out.println("The duck says...");
        testDuck(duck);
        sep();

        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);
        sep();

        System.out.println("The duckAdapter says...");
        testTurkey(duckAdapter);
        sep();
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    public static void sep() {
        System.out.println("--------------------");
    }
}
