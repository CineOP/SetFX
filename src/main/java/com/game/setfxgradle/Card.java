package com.game.setfxgradle;

import com.game.setfxgradle.enums.*;
import javafx.scene.image.Image;

import java.io.InputStream;

public class Card {
//    private final Image cardImage;
    public boolean picked = false;
    public int id;
    public int x_pos;
    public int y_pos;

    public final SetColor color;
    public final SetCount count;
    public final SetShape shape;
    public final SetFill fill;
    public SetStyle style;
    public Card(int colour, int shape, int count, int fill, int x_grid, int y_grid) {

        this.color = SetColor.values()[colour];
        this.shape = SetShape.values()[shape];
        this.fill = SetFill.values()[fill];
        this.count = SetCount.values()[count];
    }

    private static Image getImage(SetColor col, SetShape sh, SetCount co, SetFill fill, SetStyle style){
        //        InputStream cardStream = getClass().getResourceAsStream("/images/"+Integer.toString(colour)+"_"+Integer.toString(shape)+"_"+Integer.toString(count)+"_"+Integer.toString(fill)+".png");
        //        assert cardStream != null;
        //        this.cardImage = new Image(cardStream);
        return null;
    }
    public Image getCard() {
        return Card.getImage(this.color, this.shape, this.count, this.fill, this.style);
    }





}
