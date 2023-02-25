package lk.ijse.gallery.controller;

/*
    @author DanujaV
    @created 2/26/23 - 12:29 AM   
*/

import com.google.common.io.Files;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class UserManageController {
    @FXML
    private ImageView imgDP;

    @FXML
    void btnUploadOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a photo");
        File imgFile = fileChooser.showOpenDialog(new Stage());

        Image image = new Image(imgFile.toURI().toString());
        imgDP.setImage(image);

        try {
            BufferedImage img = ImageIO.read(imgFile);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();

            //put guava dependency for this
            System.out.println("File extension: " + Files.getFileExtension(String.valueOf(imgFile)));

            ImageIO.write(img, Files.getFileExtension(String.valueOf(imgFile)), bao);
            byte[] bytes = bao.toByteArray();

            byte[] encode = Base64.getEncoder().encode(bytes);

            String base64 = new String(encode);
            System.out.println("base64: " + base64);    //you can save this in your DB if you want

            saveImageBase64ValueInTextFile(imgFile, encode);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveImageBase64ValueInTextFile(File imgFile, byte[] base64) throws IOException {
        String imgNameWithoutExtension = Files.getNameWithoutExtension(String.valueOf(imgFile));
        File file = new File("/home/danu/IdeaProjects/sample-io/image-read-write/src/main/resources/files/" + imgNameWithoutExtension + ".txt");

        if (!file.exists()) file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(base64);
        fos.close();
    }
}
