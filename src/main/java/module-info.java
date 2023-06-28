module com.game.setfxgradle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires com.google.gson;

    opens com.game.setfxgradle to javafx.fxml;
    exports com.game.setfxgradle;
    exports com.game.setfxgradle.enums;
    opens com.game.setfxgradle.enums to javafx.fxml;
}