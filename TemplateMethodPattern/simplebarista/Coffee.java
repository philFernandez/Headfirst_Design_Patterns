
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping cofeve through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        ConsoleReader in = ConsoleReader.INSTANCE;
        System.out.print("Milk and Sugar? (y/n): ");
        String answer = in.nextLine();
        return answer;
    }

}