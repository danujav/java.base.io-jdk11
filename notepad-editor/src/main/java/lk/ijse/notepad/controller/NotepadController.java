package lk.ijse.notepad.controller;

/*
    @author DanujaV
    @created 2/25/23 - 10:55 PM   
*/

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.*;

public class NotepadController {
    @FXML
    private JFXTextArea txtArea;

    @FXML
    void itmSaveOnAction(ActionEvent event) {
        String msg = txtArea.getText();

        File file = new File("/home/danu/Desktop/abc.txt");

        //through character stream
        /*try {
            if(!file.exists()) {
                file.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(msg);

            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }*/

        //through byte stream
        try {
            FileOutputStream fos = new FileOutputStream(file); byte[] bytes = msg.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
