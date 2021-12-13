import java.io.File;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(999);
            fos.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
