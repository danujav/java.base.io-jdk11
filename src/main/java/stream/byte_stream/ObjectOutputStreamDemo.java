package stream.byte_stream;

/*
    @author DanujaV
    @created 2/24/23 - 11:04 PM   
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            //FileOutputStream is output stream for writing data to a File or FileDescriptor.
            //ObjectOutputStream for write primitive and objects type to an output stream.
            //.tmp file generally used for backup purpose on the Operating Systems.
            FileOutputStream fos = new FileOutputStream("src/main/resources/files/ObjectBackup.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(2000);
            oos.writeObject(new int[]{10, 20, 30, 40, 50});
            oos.writeObject(new Date());

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
