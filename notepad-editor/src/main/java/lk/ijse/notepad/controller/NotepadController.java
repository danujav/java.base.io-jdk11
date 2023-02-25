package lk.ijse.notepad.controller;

/*
    @author DanujaV
    @created 2/25/23 - 10:55 PM   
*/

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class NotepadController {
    @FXML
    private JFXTextArea txtArea;

    @FXML
    void itmSaveOnAction(ActionEvent event) {
        String msg = txtArea.getText();
    }
}
