package com.mattgoodwin.ponggame;

import android.graphics.RectF;

public class Paddle {
    private int disWidth;
    private int disHeight;
    private RectF paddle;
    private float pWidth;
    private float pHeight;
    private float paddleX;
    private float paddleY;
    //public final int STOPPED = 0;
    public final int LEFT = 1;
    public final int RIGHT = 2;
    //private int mBatMoving = STOPPED;

    public Paddle(int disWidth, int disHeight){
        this.disWidth = disWidth;
        this.disHeight = disHeight;

        pWidth = disWidth/10;
        pHeight = disHeight/20;

        paddleX = disWidth/4;
        paddleY = disHeight/2;

        paddle = new RectF(paddleX - pWidth, paddleY, paddleX + pWidth, paddleY - pHeight);
    }

    public void movePaddle(){
        paddle.left = paddleX - pWidth;
        paddle.right = paddleX + pWidth;
    }

    public RectF getPaddle(){
        return paddle;
    }




}