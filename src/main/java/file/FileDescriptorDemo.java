package file;/*
    @author DanujaV
    @created 2/20/23 - 10:25 AM   
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorDemo {
    public static void main(String[] args) throws IOException {
        // Initializing a FileDescriptor
        FileDescriptor descriptor = null;
        FileOutputStream out = null;

        // HERE I'm writing "DANU" in my file
        byte[] buffer = {68, 65, 78, 85};

        try{
            var file = new File("src/main/resources/files/FileDescriptorDemo.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            out = new FileOutputStream(file);

            // This getFD() method is called before closing the output stream
            descriptor = out.getFD();

            // writes byte to file output stream
            out.write(buffer);

            // USe of sync() : to sync data to the source file
            descriptor.sync();
            System.out.print("\nUse of Sync Successful ");

        }catch(Exception except){
            // if in case IO error occurs
            except.printStackTrace();
        }finally{
            // releases system resources
            if(out!=null)
                out.close();
        }
    }
}
