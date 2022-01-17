package io.astra;

/**
 * description: Astra <br>
 *
 * @author xie hui <br>
 * @version 1.0 <br>
 * @date 2022/1/13 15:45 <br>
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Astra extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/astra.fxml"));
        primaryStage.setTitle("Astra");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

