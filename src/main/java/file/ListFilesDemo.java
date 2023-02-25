package file;

/*
    @author DanujaV
    @created 2/25/23 - 4:08 PM   
*/

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File file1 = new File("/home/danu/Desktop");
        File file2 = new File("/home/danu/Desktop/java.png");

        if(!file1.exists() || !file2.exists()) {
            System.out.println("file not exists");
            return;
        }

        System.out.println("isFile 1: " + file1.isFile());
        System.out.println("isFile 2: " + file2.isFile());

        System.out.println("isDirectory 1: " + file1.isDirectory());
        System.out.println("isDirectory 2: " + file2.isDirectory());

        String[] files = file1.list();
        for (String file : files) {
            System.out.println("File: " + file);
        }
    }
}
