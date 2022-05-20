package Streams.IoStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIoExample {
    public FileIoExample() {
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/programming/java programs/projects/Test.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        } catch (IOException var5) {
            System.out.println(var5);
        }

    }
}
