package com.project.funfacts;

import android.graphics.Color;

import java.util.Random;

public class Colors {
   private String[] colors = {
            "#39add1",
            "#51b46d",
            "#53bbb4",
            "#b7c0c1",
            "#f092b0",
            "#637a91",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#eoab18"
    };

    public int getColors() {
        Random random = new Random();
        int randomNumber = random.nextInt(colors.length);
        int color= Color.parseColor(colors[randomNumber]);
        return color;
    }
}
