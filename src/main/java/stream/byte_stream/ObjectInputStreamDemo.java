package stream.byte_stream;

/*
    @author DanujaV
    @created 2/24/23 - 11:18 PM   
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Date;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/files/ObjectBackup.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int i = ois.readInt();
            System.out.println(i);

            int[] ar = (int[])ois.readObject();
            System.out.println(Arrays.toString(ar));

            Date date =(Date) ois.readObject();
            System.out.println(date);

            Object o = ois.readObject();    //Illegal
            System.out.println(o);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
