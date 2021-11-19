import java.util.Scanner;

public enum ConsoleReader {
    INSTANCE;

    private Scanner reader = new Scanner(System.in);

    public String nextLine() {
        return reader.nextLine();
    }

    public void close() {
        reader.close();
    }
}
