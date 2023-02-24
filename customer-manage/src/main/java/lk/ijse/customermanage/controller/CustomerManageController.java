package lk.ijse.customermanage.controller;

/*
    @author DanujaV
    @created 2/25/23 - 12:23 AM   
*/

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import lk.ijse.customermanage.db.DataStore;
import lk.ijse.customermanage.dto.Customer;

public class CustomerManageController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

    public void btnSaveOnAction(ActionEvent actionEvent) {
        Integer id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        Double salary = Double.valueOf(txtSalary.getText());

        Customer customer = new Customer(
                id,
                name,
                address,
                salary
        );

        boolean isAdded = DataStore.writeObject(customer);
    }

}
