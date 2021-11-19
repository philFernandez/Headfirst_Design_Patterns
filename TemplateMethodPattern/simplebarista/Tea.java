
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
        System.out.print("Lemon? (y/n): ");
        String answer = in.nextLine();
        in.close();
        return answer;
    }

    // private String getUserInput() {
    // String answer = null;
    // System.out.print("Lemon? (y/n): ");

    // try (BufferedReader in = new BufferedReader(new
    // InputStreamReader(System.in))) {
    // answer = in.readLine();
    // } catch (IOException e) {
    // System.err.println(e);
    // }

    // if (answer == null) {
    // return "no";
    // }

    // return answer;
    // }

}