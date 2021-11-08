public class Starbuzz {
    public static void main(String[] args) {
        Beverage doubleMochaSoyLatteWithWhip = new HouseBlend();
        doubleMochaSoyLatteWithWhip = new Soy(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Mocha(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Mocha(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Whip(doubleMochaSoyLatteWithWhip);
        System.out.println(doubleMochaSoyLatteWithWhip.getDescription() + ": $" + doubleMochaSoyLatteWithWhip.cost());
    }
}
