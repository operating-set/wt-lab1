package com.company.classesAndObjects.task9.util;

import java.util.ArrayList;

public class Basket {
    private int weight;
    private ArrayList<Ball> balls;

    public Basket() {
        weight = 0;
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
        weight+=ball.getWeight();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public int getWeight() {
        return weight;
    }
}
