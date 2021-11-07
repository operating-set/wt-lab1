package com.company.classesAndObjects.task9.util;

public class Ball {
    public enum color {RED, BLUE, YELLOW};

    private color ballColor;
    private int weight;

    public Ball(color ballColor, int weight) {
        this.ballColor = ballColor;
        this.weight = weight;
    }

    public color getBallColor() {
        return ballColor;
    }

    public void setBallColor(color ballColor) {
        this.ballColor = ballColor;
    }

    int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
