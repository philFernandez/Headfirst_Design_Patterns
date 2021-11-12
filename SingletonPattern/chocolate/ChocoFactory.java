public class ChocoFactory {
    public static void main(String[] args) {
        // User synchronized classic singleton class
        ChocolateBoiler singleBoiler = ChocolateBoiler.getInstance();
        System.out.println("singleBoiler Boiled: " + singleBoiler.isBoiled());
        singleBoiler.boil();
        System.out.println("singleBoiler Boiled: " + singleBoiler.isBoiled());
        singleBoiler.fill();
        singleBoiler.boil();
        System.out.println("singleBoiler Boiled: " + singleBoiler.isBoiled());
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println("boiler Boiled: " + boiler.isBoiled());
        System.out.println("singleBoiler Empty: " + singleBoiler.isEmpty());
        System.out.println("boiler Empty: " + boiler.isEmpty());
        boiler.drain();
        System.out.println("singleBoiler Empty: " + singleBoiler.isEmpty());
        System.out.println("boiler Empty: " + boiler.isEmpty());

        System.out.println("-----------------------------------------------");
        // Use better enum singleton
        ChocolateEnumBoiler singleEnumBoiler = ChocolateEnumBoiler.INSTANCE;
        System.out.println("singleEnumBoiler Boiled: " + singleEnumBoiler.isBoiled());
        singleEnumBoiler.boil();
        System.out.println("singleEnumBoiler Boiled: " + singleEnumBoiler.isBoiled());
        singleEnumBoiler.fill();
        singleEnumBoiler.boil();
        System.out.println("singleEnumBoiler Boiled: " + singleEnumBoiler.isBoiled());
        ChocolateEnumBoiler enumBoiler = ChocolateEnumBoiler.INSTANCE;
        System.out.println("enumBoiler Boiled: " + enumBoiler.isBoiled());
        System.out.println("singleEnumBoiler Empty: " + singleEnumBoiler.isEmpty());
        System.out.println("enumBoiler Empty: " + enumBoiler.isEmpty());
        boiler.drain();
        System.out.println("singleEnumBoiler Empty: " + singleEnumBoiler.isEmpty());
        System.out.println("enumBoiler Empty: " + enumBoiler.isEmpty());
    }
}
