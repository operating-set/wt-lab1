package com.company.javaFundamentals.task2.run;

import com.company.javaFundamentals.task2.util.Task2;

public class Main {
    public static void main(String[] args) {
        double x = 6;
        double y = -1;

        System.out.println("Точка с координатами (" + x + ";" + y + ")" + (Task2.solution(x,y)? " " : " не ") +
                "принадлежит закрашенной области");
    }
}
