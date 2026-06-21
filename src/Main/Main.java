package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        MainView v = MainView.getInstance();
        stage.setTitle("StreamThis!");
        stage.setScene(new Scene(v,400,250));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}