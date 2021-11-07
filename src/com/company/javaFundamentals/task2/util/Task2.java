package com.company.javaFundamentals.task2.util;

public class Task2 {
    public static boolean solution(double x, double y){
        if(x<=4 && x>=-4 && y>=0 && y<=5) return true;
        return x <= 6 && x >= -6 && y <= 0 && y >= -3;
    }
}
