package com.codeherlife.mysecondgame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
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
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update(){

    }

    public void update(Point point){
        //l,t,r,b
        rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height(), point.x + rectangle.width()/2, point.y + rectangle.height()/2);
    }

}
