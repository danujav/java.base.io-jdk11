package file;/*
    @author DanujaV
    @created 2/20/23 - 10:14 AM   
*/

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {
        /*The File class is Java’s representation of a file or
        directory pathname.The File class contains several
       methods for working with the pathname, deleting and renaming
        files, creating new directories, listing the contents of a
        directory, and determining several common attributes of
        files and directories.*/

        var file = new File("src/main/resources/files/FileDemo.txt");
        boolean isCreated = false;
        try {
            if(!file.exists()) {
                isCreated = file.createNewFile();
            }
            System.out.println("File isCreated: " + isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        var filePath = file.getPath();
        System.out.println("File Path: " + filePath);

        var parentFile = file.getParent();
        System.out.println("Parent File: " + parentFile);

        var fileName = file.getName();
        System.out.println("File Name: " + fileName);

        var canRead = file.canRead();
        System.out.println("canRead: " + canRead);

        var canWrite = file.canWrite();
        System.out.println("canWrite: " + canWrite);

        var isExists = file.exists();
        System.out.println("isExists: " + isExists);

        //measured in milliseconds since the epoch (00:00:00 GMT, January 1, 1970)
        var lastModified = file.lastModified();
        System.out.println("Last Modified: " + lastModified);

        /*Returns an array of strings naming the files
        and directories in the directory denoted by this abstract pathname.*/
        var list = file.list();
        System.out.println(Arrays.toString(list));

        var isSetReadOnly = file.setReadOnly();
        System.out.println("isSetReadOnly: " + isSetReadOnly);


    }
}
