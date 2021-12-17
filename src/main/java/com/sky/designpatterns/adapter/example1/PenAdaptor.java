package com.sky.designpatterns.adapter.example1;

public class PenAdaptor implements Pen {

    private BallPointPen ballPointPen = new BallPointPen();

    @Override
    public void write(String text) {
        ballPointPen.writeText(text);

    }
}
