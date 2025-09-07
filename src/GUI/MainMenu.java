package GUI;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainMenu {
    private Stage stage;
    private BorderPane borderPane;
    private ToolBar toolbar;
    private Scene scene;
    private AudioPlayerGUI audioPlayerGUI;
    public MainMenu(Stage stage) {
        this.stage = stage;
        borderPane = new BorderPane();

        audioPlayerGUI = new AudioPlayerGUI();
        toolbar = audioPlayerGUI.getToolBar();

        scene = new Scene(borderPane);
        stage.setScene(scene);
        setUpWindow();
    }

    private void setUpWindow() {
        centreWindowOnOpen();
        setUpToolBar();
    }

    private void setUpToolBar() {
        HBox hBox = new HBox(toolbar);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setBottom(hBox);
    }

    private void centreWindowOnOpen() {
        stage.centerOnScreen();

        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        double screenWidth = screenBounds.getWidth();
        double screenHeight = screenBounds.getHeight();

        double windowWidth = screenWidth * 0.75;
        double windowHeight = screenHeight * 0.75;

        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
    }
}
