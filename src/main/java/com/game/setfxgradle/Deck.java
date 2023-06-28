package com.game.setfxgradle;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Deck {
    String jsonS;
    JsonObject jsonObject;
    BufferedReader reader;
    Gson gson = new Gson();

    public Deck(String jsonS) {
        this.jsonS = jsonS;
        try {
            this.reader = new BufferedReader(new FileReader(jsonS));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.jsonObject = gson.fromJson(reader, JsonObject.class);
    }

    public JsonArray getCards(){
        JsonArray cards = jsonObject.get("cards").getAsJsonArray();
        return cards;
    }

    public int getId(int ind){
        int id = Integer.parseInt(getCards().get(ind).getAsJsonObject().get("id").toString());
        return id;
    }

    public int getColor(int ind){
        int color = Integer.parseInt(getCards().get(ind).getAsJsonObject().get("color").toString());
        return color;
    }

    public int getShape(int ind){
        int shape = Integer.parseInt(getCards().get(ind).getAsJsonObject().get("shape").toString());
        return shape;
    }

    public int getFill(int ind){
        int fill = Integer.parseInt(getCards().get(ind).getAsJsonObject().get("fill").toString());
        return fill;
    }

    public int getCount(int ind){
        int count = Integer.parseInt(getCards().get(ind).getAsJsonObject().get("count").toString());
        return count;
    }

}
