package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AudioPlayerGUI {
    private ToolBar toolBar;
    private boolean isPlaying;
    private Button prevBtn;
    private Button playAndPauseBtn;
    private Button nextBtn;

    public AudioPlayerGUI() {
        toolBar = new ToolBar();
        isPlaying = false;
        setUpToolBar();
        playAndPauseOnClick();
    }

    private void setUpToolBar() {
        prevBtn = new Button("⏮");
        playAndPauseBtn = new Button("▶");
        nextBtn = new Button("⏭");

        toolBar.getItems().addAll(prevBtn, playAndPauseBtn, nextBtn);
    }

    private void playAndPauseOnClick() {
        playAndPauseBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            isPlaying = !isPlaying;
            switchPlayAndPause();
        });
    }

    private void switchPlayAndPause() {
        if (isPlaying) {
            playAndPauseBtn.setText("⏸");
        } else {
            playAndPauseBtn.setText("▶");
        }
    }

    public ToolBar getToolBar() {
        return toolBar;
    }
}
