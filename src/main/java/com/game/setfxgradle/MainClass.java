package com.game.setfxgradle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import com.google.gson.Gson;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainClass.class.getResource("main-scene.fxml"));
        Scene scene = new Scene(loader.load(), 320, 240);
        MainSceneController controller = loader.getController();

        InputStream iconStream = getClass().getResourceAsStream("/images/logo.png");
        assert iconStream != null;
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Игра СЕТ");
        primaryStage.setResizable(false);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        primaryStage.setScene(scene);
        controller.onSceneStart();
        primaryStage.show();
    }

    public static void main(String[] args) {
//        launch();
        Deck deck = new Deck("D:\\Android\\SetFX\\src\\main\\java\\com\\game\\setfxgradle\\test.json");
        for (int i = 0; i < deck.getCards().size(); i++) {
            Card card = new Card(deck.getColor(i), deck.getShape(i), deck.getCount(i), deck.getFill(i), 1, 1);
            card.getPath();
        }
    }
}