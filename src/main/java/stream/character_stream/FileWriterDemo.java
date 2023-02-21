package stream.character_stream;

/*
    @author DanujaV
    @created 2/21/23 - 3:46 PM   
*/

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        var fileInput = new File("src/main/resources/files/Input.txt");
        var fileOutput = new File("src/main/resources/files/Output.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(fileInput);
            fileWriter = new FileWriter(fileOutput);

            int hexa;
            while((hexa = fileReader.read()) != -1) {
                fileWriter.write(hexa);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
