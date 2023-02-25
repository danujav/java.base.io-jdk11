package lk.ijse.customermanage.db;

/*
    @author DanujaV
    @created 2/25/23 - 12:51 AM   
*/

import lk.ijse.customermanage.dto.Customer;

import java.io.*;

public class DataStore {
    public static boolean writeObject(Customer customer) {
        try {
            FileOutputStream fos = new FileOutputStream("src/main/resources/customer.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(customer);
//            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public static Customer readObject() {
        try {
            FileInputStream fis = new FileInputStream("/home/danu/IdeaProjects/sample-io/customer-manage/src/main/resources/customer.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Customer c1 = (Customer) ois.readObject();
            System.out.println(c1);
            Customer c2 = (Customer) ois.readObject();
            System.out.println(c2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
