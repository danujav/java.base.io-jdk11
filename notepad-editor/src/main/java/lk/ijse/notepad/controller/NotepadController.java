package lk.ijse.notepad.controller;

/*
    @author DanujaV
    @created 2/25/23 - 10:55 PM   
*/

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.Arrays;

public class NotepadController {
    @FXML
    private JFXTextArea txtArea;
    @FXML
    private AnchorPane root;
    @FXML
    private MenuBar menu;

    @FXML
    void itmSaveOnAction(ActionEvent event) {
        String msg = txtArea.getText();
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
        fileChooser.setTitle("Save a file");
        File saveFile = fileChooser.showSaveDialog(root.getScene().getWindow());

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

    @FXML
    void itmOpenOnAction(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open a file");
        File openFile = fileChooser.showOpenDialog(root.getScene().getWindow());

        if(openFile == null) return;

        try {
            FileInputStream fis = new FileInputStream(openFile);
            byte[] bytes = fis.readAllBytes();

            String inputStr = new String(bytes);

            txtArea.setText(inputStr);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
