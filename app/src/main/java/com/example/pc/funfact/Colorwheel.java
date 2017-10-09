package com.example.pc.funfact;


import android.graphics.Color;

import java.util.Random;

public class Colorwheel {
    String[] colors = {
            "#003366" ,

            " #20b2aa" ,

            " #c6e2ff",

            " #468499",

            "#088da5.",

            " #0e2f44" ,

            " #afeeee",

            " #3b5998"
    };
    public int getcolor(){
        Random random= new Random();
        int randomNo = random.nextInt(colors.length);
       int color = Color.parseColor(colors[randomNo]);
        return color;

    }
}