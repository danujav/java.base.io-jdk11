package lk.ijse.gallery.controller;

/*
    @author DanujaV
    @created 2/26/23 - 12:29 AM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class UserManageController {
    @FXML
    private ImageView imgDP;

    @FXML
    void btnUploadOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a photo");
        File file = fileChooser.showOpenDialog(new Stage());

        Image image = new Image(file.toURI().toString());
        imgDP.setImage(image);


        System.out.println("file: " + file);
    }
}
