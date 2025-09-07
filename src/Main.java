import GUI.MainMenu;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Audio Visualiser");
        MainMenu mainMenu = new MainMenu(primaryStage);
        primaryStage.show();
    }
}
