package com.company.javaFundamentals.task1.util;

public class Task1 {
    public static double solution(double x, double y){
        double numerator = 1 + Math.sqrt(Math.sin(x+y));
        double denominator = 2 + Math.abs(x-(2*x/(1+Math.pow(x*y,2))));
        return numerator/denominator + x;
    }
}
