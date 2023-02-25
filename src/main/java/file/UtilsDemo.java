package file;

/*
    @author DanujaV
    @created 2/25/23 - 4:23 PM   
*/

import java.util.Properties;
import java.util.Set;

public class UtilsDemo {
    public static void main(String[] args) {
        System.out.println("OS name: " + System.getProperty("os.name"));
        System.out.println("user home: " + System.getProperty("user.home"));

        System.out.println("\n************************************************");

        Properties properties = System.getProperties();

        properties.put("ijse", "gdse");
        System.setProperty("user_name", "danu");

        for(Object key :properties.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n************************************************");

        System.out.println(System.getProperty("user_name"));
        System.out.println(System.getProperty("ijse"));

        properties.remove("user_name");
        properties.remove("ijse");

        System.out.println(System.getProperty("user_name"));
        System.out.println(System.getProperty("ijse"));
    }
}
