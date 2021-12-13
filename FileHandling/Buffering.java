package FileHandling;

import java.io.*;

public class Buffering {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.png");
        FileOutputStream fos = new FileOutputStream("test.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int i;
        while ((i=bis.read()) != -1) {
            bos.write(i);
        }
        System.out.println("Copied Successfully");
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
