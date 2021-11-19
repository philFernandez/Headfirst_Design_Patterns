
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
        String answer = null;
        try {
            System.out.print("Milk and Sugar? (y/n): ");
            answer = in.nextLine();
        } catch (ConsoleReaderClosedException e) {
            System.err.println(e);
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}