package lk.ijse.notepad.controller;

/*
    @author DanujaV
    @created 2/25/23 - 10:55 PM   
*/

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;

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

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("save a file");
        File saveFile = fileChooser.showSaveDialog(txtArea.getScene().getWindow());

        if(saveFile == null) return;

        try {
            FileOutputStream fos = new FileOutputStream(saveFile, false);
            byte[] bytes = msg.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
