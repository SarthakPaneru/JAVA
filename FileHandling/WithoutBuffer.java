package FileHandling;

import java.io.*;

public class WithoutBuffer {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.png");
        FileOutputStream fos = new FileOutputStream("test.png");

        int i;
        while ((i=fis.read()) != -1) {
            fos.write(i);
        }
        System.out.println("Copied Successfully");
        fos.close();
        fis.close();
    }
}
