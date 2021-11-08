public class Starbuzz {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast("Dark Roast");
        Mocha darkRoastWithMocha = new Mocha(darkRoast);
        System.out.println(darkRoastWithMocha);
    }
}
