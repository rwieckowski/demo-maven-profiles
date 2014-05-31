import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoApp {
    public static void main(String[] args) throws IOException {
        Properties shared = new Properties();
        shared.load(DemoApp.class.getResourceAsStream("shared.properties"));
        String message = shared.getProperty("message");

        Properties env = new Properties();
        env.load(DemoApp.class.getResourceAsStream("env.properties"));
        String name = env.getProperty("name");

        System.out.println(String.format(message, name));
    }
}
