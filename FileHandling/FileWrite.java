package FileHandling;

import java.io.*;
import java.util.Scanner;

class FileWrite {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        File file = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(file);
        System.out.println("Enter string: ");
        String str = s.nextLine();
        byte [] b = str.getBytes();
        fos.write(b);
        fos.close();
    }
}
