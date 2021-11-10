import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest {
    public static void main(String[] args) throws IOException {
        int c;
        // BufferedReader reader = new BufferedReader(new InputStreamReader(new
        // LowerCaseInputStream(System.in)));
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));
        while ((c = in.read()) >= 0) {
            System.out.print((char) c);
        }
        in.close();
    }
}