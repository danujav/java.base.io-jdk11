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
        var file = new File("/home/danu/IdeaProjects/sample-io/" +
                "src/main/resources/files/InputFile.txt");
        try {
            file.createNewFile();
            var fileInputStream = new FileInputStream(file);

            int character;
            while((character = fileInputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
