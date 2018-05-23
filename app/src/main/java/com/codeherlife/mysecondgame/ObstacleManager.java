package com.codeherlife.mysecondgame;

import java.util.ArrayList;

/**
 * Created by melanie on 5/23/18.
 */

public class ObstacleManager {
    //higher index = lower on screen = higher y value
    private ArrayList<Obstacle> obstacles;
    private  int playerGap;
    private int obstacleGap;

    public ObstacleManager(int playerGap, int obstacleGap) {
        this.playerGap = playerGap;
        this.obstacleGap = obstacleGap;

        obstacles = new ArrayList<>();

        populateObstacles();
    }

    private void populateObstacles(){
        int currY = -5*Constants.SCREEN_HEIGHT/4;
        while(obstacles.get(obstacles.size() -1).getRectangle().bottom < 0) {
            int xStart = (int)(Math.random()*(Constants.SCREEN_WIDTH - playerGap));
        }

    }
}
