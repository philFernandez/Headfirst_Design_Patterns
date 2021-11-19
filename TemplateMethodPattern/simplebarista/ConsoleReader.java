import java.util.Scanner;

public enum ConsoleReader {
    INSTANCE;

    private Scanner reader = new Scanner(System.in);
    private boolean isClosed = false;

    public String nextLine() throws ConsoleReaderClosedException {
        if (isClosed) {
            throw new ConsoleReaderClosedException(
                    "The ConsoleReader has previously been closed and is no longer available.");
        }
        return reader.nextLine();
    }

    public void close() {
        reader.close();
        isClosed = true;
    }
}
