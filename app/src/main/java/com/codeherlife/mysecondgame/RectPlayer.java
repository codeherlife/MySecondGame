package com.codeherlife.mysecondgame;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by melanie on 5/19/18.
 */

public class RectPlayer implements GameObject {

    private Rect rectangle;
    private int color;

    public RectPlayer(Rect rectangle, int color){
        this.rectangle = rectangle;
        this.color = color
    }

    @Override
    public void draw(Canvas canvas){

    }

    @Override
    public void update(){

    }

}
