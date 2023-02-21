package stream.character_stream;

/*
    @author DanujaV
    @created 2/21/23 - 3:12 PM   
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        var file = new File("src/main/resources/files/Input.txt");

        //FileReader serialize the stream as 2 byte.(16bit) (Character Stream)
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);

            int hexa;
            while((hexa = fileReader.read()) != -1) {
                System.out.print((char) hexa);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                /*An assert statement is used to declare
                an expected boolean condition in a program.*/
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
