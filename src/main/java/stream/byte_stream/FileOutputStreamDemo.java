package stream.byte_stream;

/*
    @author DanujaV
    @created 2/20/23 - 2:52 PM   
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File fileInput = new File("src/main/resources/files/Input.txt");
        File fileOutput = new File("src/main/resources/files/Output.txt");

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            if (fileInput.exists()) {
                if (!fileOutput.exists()) {
                    fileOutput.createNewFile();
                }
            }
            inputStream = new FileInputStream(fileInput);
            outputStream = new FileOutputStream(fileOutput);

            int hexa;
            while((hexa = inputStream.read()) != -1) {
                outputStream.write(hexa);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(inputStream != null) {
                    inputStream.close();
                }
                if(outputStream != null) {
                    outputStream.close();
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
