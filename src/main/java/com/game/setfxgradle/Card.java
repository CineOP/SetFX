package com.game.setfxgradle;

import com.game.setfxgradle.enums.*;
import javafx.scene.image.Image;

import java.io.File;
import java.io.InputStream;
import java.util.Objects;


public class Card {
    //    private final Image cardImage;
    public String path;
    public boolean picked = false;
    public int id;
    public int x_pos;
    public int y_pos;

    public final SetColor color;
    public final SetCount count;
    public final SetShape shape;
    public final SetFill fill;

    public SetStyle style;

    public Card(int colour, int shape, int count, int fill, int x_pos, int y_pos) {

        this.color = SetColor.values()[colour-1];
        this.shape = SetShape.values()[shape-1];
        this.fill = SetFill.values()[fill-1];
        this.count = SetCount.values()[count-1];
        this.x_pos = x_pos;
        this.y_pos = y_pos;

    }

//    private static Image getImage(SetColor col, SetShape sh, SetCount co, SetFill fill, SetStyle style) {
//        String path = "/images/" + style.toString()+ "_" + Integer.toString(SetColor.valueOf(col.toString()).ordinal()) + "_" + Integer.toString(SetShape.valueOf(sh.toString()).ordinal()) + "_" + Integer.toString(SetCount.valueOf(co.toString()).ordinal()) + "_" + Integer.toString(SetFill.valueOf(fill.toString()).ordinal()) + ".png";
//        return new Image(Objects.requireNonNull(Card.class.getResourceAsStream(path)));
//    }
//
//    public Image getCard() {
//        return Card.getImage(this.color, this.shape, this.count, this.fill, this.style);
//    }

    public void getPath(){
        SetColor col = this.color;
        SetShape sh = this.shape;
        SetCount co = this.count;
        SetFill fill = this.fill;
        this.style = SetStyle.STEAMPUNK;
        String path = "D:\\Android\\SetFX\\src\\main\\resources\\images\\styles\\" + style.toString().toLowerCase() + "\\" + style.toString() + "_"+ col.toString() + "_" + sh.toString() + "_" + fill.toString() + "_" + co.toString() + ".png";
        System.out.println(new File(path).exists());
        System.out.println(path);
    }


}
