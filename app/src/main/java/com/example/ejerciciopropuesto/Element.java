package com.example.ejerciciopropuesto;

import com.google.gson.Gson;

public class Element {
    public String txt;
    public int img;

    public Element(String txt, int img) {
        this.txt = txt;
        this.img = img;
    }

    public String toJson() {
        Gson gson = new Gson();

        return  gson.toJson(this);
    }
}
