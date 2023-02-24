package lk.ijse.customermanage.db;

/*
    @author DanujaV
    @created 2/25/23 - 12:51 AM   
*/

import lk.ijse.customermanage.dto.Customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
}
