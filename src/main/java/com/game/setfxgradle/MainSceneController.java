package com.game.setfxgradle;

import com.game.setfxgradle.enums.SetStyle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Timer;

import java.io.InputStream;
import java.util.TimerTask;

public class MainSceneController {
    public Text score_1;
    public Text score_2;
    public Text time;
    public Text cards_left;
    public Button switch_styles;
    public VBox history_sets;
    public Button new_game;
    public Button more_cards;
    public Button find_set;
    private SetStyle style = SetStyle.HORROR;


    @FXML
    private GridPane game_field;
    @FXML
    private ImageView background_image;
    @FXML
    private BorderPane working_pane;

    public MainSceneController() {
    }

    public SetStyle getStyle() {
        return style;
    }

    public void setStyle(SetStyle style) {
        this.style = style;
        onStyleChange(this.style);
    }
    private void make_time(){
        Timer timer = new Timer();
        long startTime = System.currentTimeMillis();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm:ss");
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long curtime = (long)(System.currentTimeMillis()-startTime)/1000;
                time.setText("Время: " + dtf.format(LocalTime.ofSecondOfDay(curtime)));
            }
        }, 0, 1000);
    }

    public void onSceneStart() {
        onStyleChange(style);
        make_time();
    }


    public void onStyleChange(SetStyle style){
        changeBackground("/images/styles/" + style.name().toLowerCase() + "/background.png");
    }
    private void changeBackground(String path){
        InputStream iconStream = getClass().getResourceAsStream(path);
        assert iconStream != null;
        Image background = new Image(iconStream);
        background_image.setImage(background);
    }
}
