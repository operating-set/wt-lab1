package com.company.classesAndObjects.task9.run;

import com.company.classesAndObjects.task9.util.Ball;
import com.company.classesAndObjects.task9.util.Basket;

public class Main {
    public static void main(String[] args) {
        Basket myBasket = new Basket();

        myBasket.addBall(new Ball(Ball.color.BLUE,5));
        myBasket.addBall(new Ball(Ball.color.RED,7));
        myBasket.addBall(new Ball(Ball.color.YELLOW,11));
        myBasket.addBall(new Ball(Ball.color.BLUE,3));
        myBasket.addBall(new Ball(Ball.color.RED,1));

        int amount = 0;
        for(Ball x: myBasket.getBalls()) if(x.getBallColor()== Ball.color.BLUE) amount++;

        System.out.println("Вес корзины: "+myBasket.getWeight());
        System.out.println("Количнство синих шаров в корзине: "+amount);
    }
}

