package lk.ijse.gallery;

/*
    @author DanujaV
    @created 2/26/23 - 12:40 AM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(
                FXMLLoader.load(this.getClass().getResource("/view/user_manage.fxml"))));

        stage.setTitle("User Manage");
        stage.centerOnScreen();

        stage.show();
    }
}
