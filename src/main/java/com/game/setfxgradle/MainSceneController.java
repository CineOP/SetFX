package com.game.setfxgradle;

import com.game.setfxgradle.enums.SetStyle;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.InputStream;

public class MainSceneController {
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

    public void onSceneStart() {
        onStyleChange(style);
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
