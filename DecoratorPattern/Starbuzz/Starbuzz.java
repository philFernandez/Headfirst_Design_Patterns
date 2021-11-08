public class Starbuzz {
    public static void main(String[] args) {
        Beverage doubleMochaSoyLatteWithWhip = new Soy(new Whip(new Mocha(new Mocha(new HouseBlend()))));
        System.out.println(doubleMochaSoyLatteWithWhip.getDescription());
    }
}
