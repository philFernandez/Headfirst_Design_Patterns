public class Starbuzz {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast("Dark Roast");
        Mocha darkRoastWithMocha = new Mocha(darkRoast);
        Milk darkRoastWithMochaAndMilk = new Milk(darkRoastWithMocha);
        System.out.println(darkRoastWithMochaAndMilk.getDescription());
    }
}
