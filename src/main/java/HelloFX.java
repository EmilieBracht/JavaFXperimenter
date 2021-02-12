import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {

        String version = System.getProperty("javafx.version");
        Label label= new Label("Hello from JavaFX" + version);
        StackPane stackPane = new StackPane(label);
        Scene scene = new Scene(stackPane, 640, 480);
        stage.setScene(scene);
        stage.show();

    }
}
