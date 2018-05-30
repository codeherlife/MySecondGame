package com.codeherlife.mysecondgame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by melanie on 5/22/18.
 */

public class Obstacle implements GameObject{
    private Rect rectangle;
    private Rect rectangle2;
    private int color;


    public Obstacle (int rectHeight, int color, int startX, int startY, int playerGap){
        this.color = color;
        //l,t,r,b
        rectangle = new Rect(0, startY, startX, startY + rectHeight);
        rectangle2 = new Rect(startX + playerGap, startY, Constants.SCREEN_WIDTH, startY + rectHeight);
    }

    public boolean playerCollide(RectPlayer player){
        if(rectangle.contains(player.getRectangle().left, player.getRectangle().top)
                || rectangle.contains(player.getRectangle().right, player.getRectangle().top)
                || rectangle.contains(player.getRectangle().left, player.getRectangle().bottom)
                || rectangle.contains(player.getRectangle().right, player.getRectangle().bottom))
                return true;

        return false;
    }

    @Override
    public void draw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);
        canvas.drawRect(rectangle2, paint);
    }

    @Override
    public void update(){

    }
}
