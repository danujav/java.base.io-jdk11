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

            /*int i = ois.readInt();
            System.out.println(i);

            int[] ar = (int[])ois.readObject();
            System.out.println(Arrays.toString(ar));

            Date date =(Date) ois.readObject();
            System.out.println(date);

            Object o = ois.readObject();    //Illegal
            System.out.println(o);*/


           /* System.out.println(ois.available());    //return the number of byte that input file contain
            ois.readByte(); // read one bye per every readByte() method calling
            System.out.println(ois.available());
            ois.readByte();
            System.out.println(ois.available());*/


            // we need to fetch order to how we wrote data through output stream
            System.out.println(ois.readInt());
            System.out.println(Arrays.toString((int[])ois.readObject()));
            System.out.println(ois.readObject());
            System.out.println(ois.readUTF());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readInt());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
