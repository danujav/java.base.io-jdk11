package lk.ijse.notepad;

/*
    @author DanujaV
    @created 2/25/23 - 10:53 PM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(
                FXMLLoader.load(
                        this.getClass().getResource("/view/notepad.fxml"))));
        stage.centerOnScreen();
        stage.setTitle("Notepad Editor");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
