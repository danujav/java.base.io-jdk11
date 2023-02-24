package lk.ijse.customermanage;

/*
    @author DanujaV
    @created 2/25/23 - 12:56 AM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = this.getClass().getResource("/view/customer_manage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Customer Manage");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
