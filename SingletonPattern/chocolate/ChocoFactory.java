public class ChocoFactory {
    public static void main(String[] args) {
        // User synchronized classic singleton class

        ChocolateBoiler singleBoiler = ChocolateBoiler.getInstance();
        System.out.println("singleBoiler Boiled: (false) " + singleBoiler.isBoiled());
        singleBoiler.boil();
        System.out.println("singleBoiler Boiled: (false) " + singleBoiler.isBoiled());
        singleBoiler.fill();
        singleBoiler.boil();
        System.out.println("singleBoiler Boiled: (true) " + singleBoiler.isBoiled());
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println("boiler Boiled: (true) " + boiler.isBoiled());
        System.out.println("singleBoiler Empty: (false) " + singleBoiler.isEmpty());
        System.out.println("boiler Empty: (false) " + boiler.isEmpty());
        boiler.drain();
        System.out.println("singleBoiler Empty: (true) " + singleBoiler.isEmpty());
        System.out.println("boiler Empty: (true) " + boiler.isEmpty());

        System.out.println("-----------------------------------------------");
        // Use better enum singleton
        ChocolateEnumBoiler singleEnumBoiler = ChocolateEnumBoiler.INSTANCE;
        System.out.println("singleEnumBoiler Boiled: (false)" + singleEnumBoiler.isBoiled());
        singleEnumBoiler.boil();
        System.out.println("singleEnumBoiler Boiled: (false)" + singleEnumBoiler.isBoiled());
        singleEnumBoiler.fill();
        singleEnumBoiler.boil();
        System.out.println("singleEnumBoiler Boiled: (true)" + singleEnumBoiler.isBoiled());
        ChocolateEnumBoiler enumBoiler = ChocolateEnumBoiler.INSTANCE;
        System.out.println("enumBoiler Boiled: (true)" + enumBoiler.isBoiled());
        System.out.println("singleEnumBoiler Empty: (false)" + singleEnumBoiler.isEmpty());
        System.out.println("enumBoiler Empty: (false)" + enumBoiler.isEmpty());
        enumBoiler.drain();
        System.out.println("singleEnumBoiler Empty: (true)" + singleEnumBoiler.isEmpty());
        System.out.println("enumBoiler Empty: (true)" + enumBoiler.isEmpty());
    }
}
