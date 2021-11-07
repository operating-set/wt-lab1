package com.company.javaFundamentals.task3.util;

public class Task3 {
    public static void solution(double a, double b, double h){
        double x = a;
        System.out.printf("%9s %9s\n", "Arg.", "Func.");
        do {
            System.out.printf("%9.3f %9.3f\n", x, func3(x));
        } while (!((x += h) > b));
    }

    private static double func3(double arg){
        return arg+1;
    }
}
