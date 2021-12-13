package FileHandling;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("test.txt");
        int i;
        while ((i=fis.read()) != -1) {
            System.out.print((char)i);
        }
        fis.close();
    }
}
