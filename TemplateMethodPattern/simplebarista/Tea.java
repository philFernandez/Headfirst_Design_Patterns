
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
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
            System.out.print("Lemon? (y/n): ");
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