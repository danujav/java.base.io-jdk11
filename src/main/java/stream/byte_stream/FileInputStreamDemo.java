package stream.byte_stream;

/*
    @author DanujaV
    @created 2/20/23 - 1:57 PM   
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        var file = new File("src/main/resources/files/Input.txt");
        FileInputStream fileInputStream = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileInputStream = new FileInputStream(file);

            int hexa;
            while ((hexa = fileInputStream.read()) != -1) {
                System.out.print((char) hexa);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
