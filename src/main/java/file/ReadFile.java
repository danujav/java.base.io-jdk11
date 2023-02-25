package file;

/*
    @author DanujaV
    @created 2/25/23 - 3:54 PM   
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File img = new File("src/main/resources/files/java.png");

        if(!img.exists()) {
            System.out.println("Invalid file path");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(img);
            byte[] bytes = fis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
