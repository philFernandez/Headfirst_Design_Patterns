public class Barista {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}