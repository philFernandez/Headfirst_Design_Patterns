import java.util.Scanner;

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
    boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Milk and Sugar? (y/n): ");
        String answer = in.nextLine();
        in.close();
        return answer;
    }

}